/**
 * This interface represents the state of the traffic light
 */
public interface State {

    /**
     * This method switches the light to green
     */
    void switchToGreen();

    /**
     * This method switches the light to yellow
     */
    void switchToYellow();

    /**
     * This method switches the light to red
     */
    void switchToRed();

    /**
     * Sets the total seconds that the specific light is on
     * @param seconds represents the total seconds that the light is on
     */
    void setTotalSeconds(int seconds);

    /**
     * Returns the total seconds that the specific light is on
     * @return total seconds
     */
    int getTotalSeconds();
}
