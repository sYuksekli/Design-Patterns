/**
 * This class represents the battery type sold in EU
 */
public class EUTypeBattery implements Battery {

    /**
     * This method indicates production of battery sold in EU
     * @return String which shows the properties of the battery
     */
    @Override
    public String produce() {
        String product = "Lithium-Ion type battery was produced for EU market.";
        return product;
    }
}
