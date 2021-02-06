/**
 * This class represents the case type sold in EU
 */
public class EUTypeCase implements Case {

    /**
     * This method indicates production of case sold in EU
     * @return String which shows the properties of the case
     */
    @Override
    public String make() {
        String product = "Waterproof up to 1m case was produced for EU market.";
        return product;
    }
}
