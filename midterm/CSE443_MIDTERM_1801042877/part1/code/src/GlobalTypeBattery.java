/**
 * This class represents the battery type sold in Global
 */
public class GlobalTypeBattery implements Battery{

    /**
     * This method indicates production of storage sold in battery
     * @return String which shows the properties of the battery
     */
    @Override
    public String produce() {
        String product = "Lithium-Cobalt type battery was produced for Global market.";
        return product;
    }
}
