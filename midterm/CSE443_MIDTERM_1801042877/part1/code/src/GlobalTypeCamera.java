/**
 * This class represents the camera type sold in Global
 */
public class GlobalTypeCamera implements Camera{

    /**
     * This method indicates production of camera sold in Global
     * @return String which shows the properties of the camera
     */
    @Override
    public String manufacture() {
        String product = "Opt. zoom x 2 type camera was produced for Global market.";
        return product;
    }
}
