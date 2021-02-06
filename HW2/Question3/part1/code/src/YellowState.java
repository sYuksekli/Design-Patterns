/**
 * This class represents the case where the yellow light is on
 */
public class YellowState implements State{

    /**
     * Represents the traffic light object
     */
    private TrafficLight trafficLight;

    /**
     * Represents the total seconds(3) that the traffic light is yellow in this state
     */
    private int totalSeconds;


    /**
     * Constructor to assign traffic lamb
     * @param _trafficLight represents the traffic light
     */
    public YellowState(TrafficLight _trafficLight) {
        this.trafficLight = _trafficLight;
        this.totalSeconds =3;
    }

    /**
     * This method switches the light to green
     * It can't switch its light to green from yellow directly, so this method is empty in this class
     */
    @Override
    public void switchToGreen() {
        /* EMPTY */
    }

    /**
     * This method switches the light to yellow
     * Since yellow light is already on, this method is empty in this class
     */
    @Override
    public void switchToYellow() {
        /* EMPTY */
    }

    /**
     * This method switches the light to red
     */
    @Override
    public void switchToRed() {
        System.out.println("Traffic lamb changed its state, red light is on at the moment ");
        trafficLight.setCurrent_state(trafficLight.getLightIsRed());
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
