/**
 * This class represents the battery type sold in Turkey
 */
public class TurkeyTypeBattery implements Battery{

    /**
     * This method indicates production of battery sold in Turkey
     * @return String which shows the properties of the battery
     */
    @Override
    public String produce() {
        String product = "Lithium-Boron type battery was produced for Turkey market.";
        return product;
    }
}
