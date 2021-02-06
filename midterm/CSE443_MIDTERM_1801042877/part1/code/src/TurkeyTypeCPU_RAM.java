/**
 * This class represents the cpu&ram type sold in Turkey
 */
public class TurkeyTypeCPU_RAM implements CPU_RAM {

    /**
     * This method indicates production of cpu&ram sold in Turkey
     * @return String which shows the properties of the cpu&ram
     */
    @Override
    public String manufacture() {
        String product = "8 cores CPU was produced for Turkey market.";
        return product;
    }
}
