/**
 * This class represents the traffic lamb
 */
public class TrafficLight implements Observer{

    /**
     * Represents state of the traffic light where red light is on
     */
    private State lightIsRed;

    /**
     * Represents state of the traffic light where yellow light is on
     */
    private State lightIsYellow;

    /**
     * Represents state of the traffic light where green light is on
     */
    private State lightIsGreen;

    /**
     * Represents the current state of the traffic light
     */
    private State current_state;

    /**
     * Represents the subject that the traffic light subscribed
     */
    private Subject mobeseCamera;

    /**
     * No parameter constructor to initialize fields
     */
    public TrafficLight(Subject subject) {

        lightIsGreen = new GreenState(this);
        lightIsYellow = new YellowState(this);
        lightIsRed = new RedState(this);
        current_state = lightIsRed;

        this.mobeseCamera = subject;
        mobeseCamera.register(this);
    }

    /**
     * It switches the traffic light to green
     */
    public void switchToGreen() {
        current_state.switchToGreen();
    }

    /**
     * It switches the traffic light to yellow
     */
    public void switchToYellow() {
        current_state.switchToYellow();
    }

    /**
     * It switches the traffic light to red
     */
    public void switchToRed() {
        current_state.switchToRed();
    }

    /**
     * It sets the current state of the traffic light
     * @param current_state represents a state of the traffic lamb
     */
    public void setCurrent_state(State current_state) {
        this.current_state = current_state;
    }

    /**
     * Returns the current state of the traffic lamb
     * @return the current state
     */
    public State getCurrent_state() {
        return current_state;
    }

    /**
     * Returns the state where the green light is on
     * @return State that represents the case which the green light is on
     */
    public State getLightIsGreen() {
        return lightIsGreen;
    }

    /**
     * Returns the state where the red light is on
     * @return State that represents the case which the red light is on
     */
    public State getLightIsRed() {
        return lightIsRed;
    }

    /**
     * Returns the state where the yellow light is on
     * @return State that represents the case which the yellow light is on
     */
    public State getLightIsYellow() {
        return lightIsYellow;
    }

    /**
     * This method updates the transition time between green light and yellow light
     * @param seconds is the transition time
     */
    @Override
    public void update(int seconds) {
        lightIsGreen.setTotalSeconds(seconds);
    }
}
