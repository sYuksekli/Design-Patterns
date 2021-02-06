import java.util.ArrayList;

/**
 *  This class represents a software for mobese camera
 *  Subscribed users can be informed of the traffic density
 *  when new updates occurred.
 */
public class HiTech implements Subject{

    /**
     * Represents list of subscribers
     */
    private ArrayList<Observer> observers;

    /**
     * Represent the total second that the green light is on
     */
    private int total_seconds;

    /**
     * Constructor to initialize fields
     */
    public HiTech() {
        observers = new ArrayList<>();
    }

    /**
     * This method adds an observer to the list of subscribers
     * @param o represents a subscriber
     */
    public void register(Observer o)
    {
        boolean isExist = observers.contains(o);
        if (!isExist) {
            observers.add(o);
        }
    }

    /**
     * This method removes an observer from list of subscribers
     * @param o represents a subscriber
     */
    public void unregister(Observer o)
    {
        observers.remove(o);
    }

    /**
     * This method notifies all the observers when an update occurs.
     */
    public void notifyObservers()
    {
        for (Observer currentObserver : observers)
            currentObserver.update(total_seconds);
    }

    /**
     * Setter method to test program,
     * It acts like hardware to detect traffic density on the road
     */
    public void updateDensityOfTraffic(boolean _flag) {

        notifyObservers();
    }

    /**
     *  If flag is true, it means that the traffic has increased, and
     *  this method calls the notifyObservers method to inform observers.
     *  @param flag is for controlling traffic density
     */
    public void changeDetected(boolean flag){
        if (flag) {
            this.total_seconds = 90;
            System.out.println("The traffic has increased - Green light will be on for 90 seconds");
            updateDensityOfTraffic(flag);
        }
        else {
            this.total_seconds = 60;
            System.out.println("Everything is back to normal - Green light will be on for 60 seconds");
            updateDensityOfTraffic(flag);
        }

    }
}
