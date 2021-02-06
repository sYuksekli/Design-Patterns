/**
 * This class represents the cpu&ram type sold in Global
 */
public class GlobalTypeCPU_RAM implements CPU_RAM {

    /**
     * This method indicates production of spu&ram sold in Global
     * @return String which shows the properties of the cpu&ram
     */
    @Override
    public String manufacture() {
        String product = "2 cores CPU was produced for Global market.";
        return product;
    }
}
