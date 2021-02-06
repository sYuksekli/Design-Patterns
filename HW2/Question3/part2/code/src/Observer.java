/**
 * Observer interface to use in observer design pattern
 */
public interface Observer {

    /**
     * This method updates the transition time between green light and yellow light
     * @param seconds is the transition time
     */
    void update(int seconds);
}
