/**
 * This class represents the case where the red light is on
 */
public class RedState implements State{

    /**
     * Represents the traffic light object
     */
    private TrafficLight trafficLight;

    /**
     * Represents the total seconds(15) that the traffic light is red in this state
     */
    private int totalSeconds;

    /**
     * Constructor to assign traffic lamb
     * @param _trafficLight represents the traffic light
     */
    public RedState(TrafficLight _trafficLight) {
        this.trafficLight = _trafficLight;
        this.totalSeconds = 15;
    }

    /**
     * This method switches the light to green
     */
    @Override
    public void switchToGreen() {
        System.out.println("Traffic lamb changed its state, green light is on at the moment ");
        trafficLight.setCurrent_state(trafficLight.getLightIsGreen());
    }

    /**
     * This method switches the light to yellow
     * It can't switch its light to yellow from red directly, so this method is empty in this class
     */
    @Override
    public void switchToYellow() {
        /* EMPTY */
    }

    /**
     * This method switches the light to red
     * Since red light is already on, this method is empty in this class
     */
    @Override
    public void switchToRed() {
        /* EMPTY */
    }

    /**
     * Sets the total seconds that the specific light is on
     * @param seconds represents the total seconds that the light is on
     */
    @Override
    public void setTotalSeconds(int seconds) {
        this.totalSeconds = seconds;
    }

    /**
     * Returns the total seconds that the specific light is on
     * @return total seconds
     */
    @Override
    public int getTotalSeconds() {
        return totalSeconds;
    }


}
