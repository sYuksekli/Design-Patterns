/**
 * This class represents the storage type sold in EU
 */
public class EUTypeStorage implements Storage {

    /**
     * This method indicates production of storage sold in EU
     * @return String which shows the properties of the storage
     */
    @Override
    public String fabricate() {
        String product = "Max 64 GB storage was produced for EU market";
        return product;
    }
}
