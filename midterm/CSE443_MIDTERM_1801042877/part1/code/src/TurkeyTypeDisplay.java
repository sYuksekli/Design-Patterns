/**
 * This class represents the display type sold in Turkey
 */
public class TurkeyTypeDisplay implements Display{

    /**
     * This method indicates production of display sold in Turkey
     * @return String which shows the properties of the display
     */
    @Override
    public String make() {
        String product = "32 bit display was produced for Turkey market.";
        return product;
    }
}
