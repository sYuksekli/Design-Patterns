import java.util.ArrayList;

/**
 * Driver class to test methods
 * This class behaves as client that will request to Proxy
 */
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
        // Text output can be complicated because print method used in here in order not to cut in the content of the DataBaseTable
        Thread thread = new Thread(() -> {

            for (int j = 0; j < 5; j++) {
                try {
                    if (j % 2 == 0) {
                        // Generate a random number and write this number into the 0,0 location
                        Integer num = (int) (Math.random() * (50 - 100 + 1) + 50);
                        proxy.setElementAt(0, 0, num);
                        System.out.println("by the Thread with ID " + order);
                    } else {
                        proxy.getElementAt(0, 0);
                        System.out.println("by the Thread with ID " + order);
                    }
                } catch (Exception e) {
                    System.out.println("Exception is caught");
                }
            }
        }); thread.start();
        arrayList.add(thread);
    }
}
