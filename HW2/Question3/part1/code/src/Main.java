import java.util.concurrent.TimeUnit;

/**
 * Driver class to test methods
 */
public class Main {

    public static void main(String[] args) {

        // Create traffic light object
        TrafficLight trafficLight = new TrafficLight();
        // Initially res light is on at the traffic light according to homework
        System.out.println("Traffic light shows red light at this moment");
        try {

            // I created a loop to test traffic light
            int i = 0;
            while (i < 3) {
                // Wait for 15 sec to change light to green
                TimeUnit.SECONDS.sleep(trafficLight.getLightIsRed().getTotalSeconds());

                // Light changed to green
                // Wait for 60 sec to change light to yellow
                trafficLight.switchToGreen();
                TimeUnit.SECONDS.sleep(trafficLight.getLightIsGreen().getTotalSeconds());

                // Light changed to yellow
                // Wait for 3 sec to change light to red
                trafficLight.switchToYellow();
                TimeUnit.SECONDS.sleep(trafficLight.getLightIsYellow().getTotalSeconds());

                // Light changed to red
                trafficLight.switchToRed();
                ++i;
            }

        } catch (InterruptedException e) {
            System.err.print("Exception occurred");
        }

    }
}
