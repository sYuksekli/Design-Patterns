/**
 * This class represents the camera type sold in EU
 */
public class EUTypeCamera implements Camera{

    /**
     * This method indicates production of camera sold in EU
     * @return String which shows the properties of the camera
     */
    @Override
    public String manufacture() {
        String product = "Opt. zoom x 3 type camera was produced for EU market.";
        return product;
    }
}
