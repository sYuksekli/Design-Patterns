import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) {


        // Creating the dataBaseTable and SynchronizationProxy objects
        DataBaseTable dataBaseTable = new DataBaseTable(3,2);
        SynchronizationProxy proxy = new SynchronizationProxy(dataBaseTable);
        System.out.println("Initial " + dataBaseTable.toString());

        ArrayList<Thread> threads = new ArrayList<>();

        // Create thread and start them
        createThread(proxy,threads,1);
        createThread(proxy,threads,2);
        createThread(proxy,threads,3);
        createThread(proxy,threads,4);

        // wait for threads to end
        try
        {
            for (Thread thread : threads) thread.join();
        }
        catch(Exception e) {
            System.out.println("Interrupted");
        }

        System.out.println(dataBaseTable.toString());

    }




    /**
    * Creates thread and starts it
    * @param proxy represents the synchronization proxy
    * @param arrayList represents the list that holds threads
    */
    private static void createThread(SynchronizationProxy proxy, ArrayList arrayList, int order) {

        // Active reader
        final int[] AR = {0};
        // Active writer
        final int[] AW = {0};
        // Waiting reader
        final int[] WR = {0};
        // Waiting writer
        final int[] WW = {0};
        // Mutex
        final Lock mutex = new ReentrantLock();
        // Conditional variables
        final Condition okToRead = mutex.newCondition();
        final Condition okToWrite = mutex.newCondition();

        // Text output can be complicated because print method used in here in order not to cut in the content of the DataBaseTable
        Thread thread = new Thread(() -> {

            for (int j = 0; j < 5; j++) {

                try {
                    // For writers
                    if (j % 2 == 0) {
                        mutex.lock();
                        while ((AW[0] + AR[0]) > 0) {
                            ++WW[0];
                            okToWrite.await();
                            --WW[0];
                        }
                        ++AW[0];
                        mutex.unlock();

                        // Access database
                        Integer num = (int) (Math.random() * (50 - 100 + 1) + 50);
                        proxy.setElementAt(0, 0, num);
                        System.out.println("by Thread" + order + "\n");

                        mutex.lock();
                        --AW[0];
                        if (WW[0] > 0)
                            okToWrite.signal();
                        else if (WR[0] > 0)
                            okToRead.signalAll();
                        mutex.unlock();
                    }

                    else {
                        // For readers
                        mutex.lock();
                        while ((AW[0] + WW[0]) > 0) {
                            ++WR[0];
                            okToRead.await();
                            --WR[0];
                        }
                        ++AR[0];
                        mutex.unlock();

                        // Access database
                        proxy.getElementAt(0, 0);
                        System.out.println("by Thread" + order);

                        mutex.lock();
                        --AR[0];
                        if (AR[0] == 0 && WW[0] > 0)
                            okToWrite.signal();
                        mutex.unlock();
                    }
                } catch (Exception e) {
                    System.out.println ("Exception is caught");
                }
            }
        }); thread.start();
        arrayList.add(thread);

    }
}