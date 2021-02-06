/**
 * This class represents the camera type sold in Turkey
 */
public class TurkeyTypeCamera implements Camera{

    /**
     * This method indicates production of camera sold in Turkey
     * @return String which shows the properties of the camera
     */
    @Override
    public String manufacture() {
        String product = "Opt. zoom x 4 type camera was produced for Turkey market";
        return product;
    }
}
