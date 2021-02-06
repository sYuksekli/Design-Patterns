/**
 * This class represents the storage type sold in Turkey
 */
public class TurkeyTypeStorage implements Storage {

    /**
     * This method indicates production of storage sold in Turkey
     * @return String which shows the properties of the storage
     */
    @Override
    public String fabricate() {
        String product = "Max 128 GB storage was produced for Turkey market.";
        return product;
    }
}
