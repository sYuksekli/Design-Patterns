import java.util.concurrent.TimeUnit;

/**
 * Driver class to test methods
 */
public class Main {

    public static void main(String[] args) {

        // Subject
        HiTech camera = new HiTech();
        // Observer
        TrafficLight trafficLight = new TrafficLight(camera);

        System.out.println("Traffic light shows red light at this moment");
        try {

            // For the sake of example, I use while loop to show different transition times
            for (int i = 0; i < 4; i++) {

                TimeUnit.SECONDS.sleep(trafficLight.getLightIsRed().getTotalSeconds());

                trafficLight.switchToGreen();
                TimeUnit.SECONDS.sleep(trafficLight.getLightIsGreen().getTotalSeconds());

                trafficLight.switchToYellow();
                // After one loop, we suppose that the hardware detect high density
                // This is done by changeDetected method
                if (i == 1) {
                    camera.changeDetected(true);
                }
                TimeUnit.SECONDS.sleep(trafficLight.getLightIsYellow().getTotalSeconds());

                trafficLight.switchToRed();
                // After two loop, we suppose that the hardware detect low density
                // This is done by changeDetected method
                if (i == 2) {
                    camera.changeDetected(false);
                }
            }

        } catch (InterruptedException e) {
            System.err.print("Exception occurred");
        }

    }
}
