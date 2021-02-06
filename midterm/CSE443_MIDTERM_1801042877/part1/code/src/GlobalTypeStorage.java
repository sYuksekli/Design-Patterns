/**
 * This class represents the storage type sold in Global
 */
public class GlobalTypeStorage implements Storage {

    /**
     * This method indicates production of storage sold in Global
     * @return String which shows the properties of the storage
     */
    @Override
    public String fabricate() {
        String product = "Max 32 GB storage was produced for Global market";
        return product;
    }
}
