/**
 * It represents the factory that produces components for Global.
 */
public class GlobalSmartPhoneComponentFactory implements SmartPhoneComponentsFactory {

    /**
     * This method produces a cpu&ram component
     * @return cpu&ram that will be used in phone
     */
    @Override
    public CPU_RAM produceCPU_RAM() {
        return new GlobalTypeCPU_RAM();
    }

    /**
     * This method produces a display component
     * @return Display that will be used in phone
     */
    @Override
    public Display produceDisplay() {
        return new GlobalTypeDisplay();
    }

    /**
     * This method produces a battery component
     * @return battery that will be used in phone
     */
    @Override
    public Battery produceBattery() {
        return new GlobalTypeBattery();
    }

    /**
     * This method produces a storage component
     * @return Storage that will be used in phone
     */
    @Override
    public Storage produceStorage() {
        return new GlobalTypeStorage();
    }

    /**
     * This method produces a camera component
     * @return Camera that will be used in phone
     */
    @Override
    public Camera produceCamera() {
        return new GlobalTypeCamera();
    }

    /**
     * This method produces a case component
     * @return Case that will be used in phone
     */
    @Override
    public Case produceCase() {
        return new GlobalTypeCase();
    }
}
