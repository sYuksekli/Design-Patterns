/**
 * This class represents the case where the green light is on
 */
public class GreenState implements State{

    /**
     * Represents the traffic light object
     */
    private TrafficLight trafficLight;

    /**
     * Represents the total seconds(60) that the traffic light is green in this state
     */
    private int totalSeconds;

    /**
     * Constructor to assign traffic lamb
     * @param _trafficLight represents the traffic light
     */
    public GreenState(TrafficLight _trafficLight) {
        this.trafficLight = _trafficLight;
        this.totalSeconds = 60;
    }

    /**
     * This method switches the light to green
     * Since green light is already on, this method is empty in this class
     */
    @Override
    public void switchToGreen() {
        /* EMPTY */
    }

    /**
     * This method switches the light to yellow
     */
    @Override
    public void switchToYellow() {
        System.out.println("Traffic lamb changed its state, yellow light is on at the moment ");
        trafficLight.setCurrent_state(trafficLight.getLightIsYellow());
    }

    /**
     * This method switches the light to red
     * It can't switch its light directly to red from green, so this method is empty in this class
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
