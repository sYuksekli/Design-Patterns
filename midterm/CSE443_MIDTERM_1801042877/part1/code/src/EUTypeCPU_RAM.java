/**
 * This class represents the cpu&ram type sold in EU
 */
public class EUTypeCPU_RAM implements CPU_RAM {

    /**
     * This method indicates production of cpu&ram sold in EU
     * @return String which shows the properties of the cpu&ram
     */
    @Override
    public String manufacture() {
        String product = "4 cores CPU was produced for EU market.";
        return product;
    }
}
