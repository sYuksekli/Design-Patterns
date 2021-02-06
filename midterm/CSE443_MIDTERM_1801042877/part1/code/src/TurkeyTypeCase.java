/**
 * This class represents the case type sold in Turkey
 */
public class TurkeyTypeCase implements Case {

    /**
     * This method indicates production of case sold in Turkey
     * @return String which shows the properties of the case
     */
    @Override
    public String make() {
        String product = "Waterproof up to 2m case was produced for Turkey market.";
        return product;
    }
}
