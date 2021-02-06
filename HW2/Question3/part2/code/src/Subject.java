/**
 * Subject interface to use in observer pattern
 */
public interface Subject {

    /**
     * This abstract method adds an observer to the list of subscribers
     * @param o represents a subscriber
     */
    void register(Observer o);

    /**
     * This abstract method removes an observer from list of subscribers
     * @param o represents a subscriber
     */
    void unregister(Observer o);

    /**
     * This method notifies all the observers when an update occurs.
     */
    void notifyObservers();
}
