/**
 * This interface represents a factory that the components of the phone will be produced.
 */
public interface SmartPhoneComponentsFactory {

    /**
     * This method produces a display component
     * @return Display that will be used in phone
     */
    Display produceDisplay();

    /**
     * This method produces a battery component
     * @return battery that will be used in phone
     */
    Battery produceBattery();

    /**
     * This method produces a cpu&ram component
     * @return cpu&ram that will be used in phone
     */
    CPU_RAM produceCPU_RAM();

    /**
     * This method produces a storage component
     * @return Storage that will be used in phone
     */
    Storage produceStorage();

    /**
     * This method produces a camera component
     * @return Camera that will be used in phone
     */
    Camera produceCamera();

    /**
     * This method produces a case component
     * @return Case that will be used in phone
     */
    Case produceCase();
}
