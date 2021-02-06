/**
 * This class represents the display type sold in EU
 */
public class EUTypeDisplay implements Display{


    /**
     * This method indicates production of display sold in EU
     * @return String which shows the properties of the display
     */
    @Override
    public String make() {
        String product = "24 bit display was produced for EU market.";
        return product;
    }

}
