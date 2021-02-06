/**
 * This class represents a smart phone.
 */
public abstract class SmartPhone {

    /**
     * Represents the model of the phone
     */
    protected String model;

    /**
     * Represents the cpu&ram component of the phone
     */
    protected CPU_RAM cpu_ram;

    /**
     * Represents the display component of the phone
     */
    protected Display display;

    /**
     * Represents the battery component of the phone
     */
    protected Battery battery;

    /**
     * Represents the storage component of the phone
     */
    protected Storage storage;

    /**
     * Represents the camera component of the phone
     */
    protected Camera camera;

    /**
     * Represents the case component of the phone
     */
    protected Case Case;

    /**
     * This method manufactures the necessary components to make a smart phone
     */
    public abstract void produceComponents();

    /**
     * This method attaches the cpu&ram
     */
    public void attachCPU_RAMtoBoard() {
        System.out.println("-Attaching RAM&CPU to the board");
    }

    /**
     * This method attaches the display
     */
    public void attachDisplay() {
        System.out.println("-Attaching Display");
    }

    /**
     * This method attaches the battery
     */
    public void attachBattery() {
        System.out.println("-Attaching Battery");
    }

    /**
     * This method attaches the storage
     */
    public void attachStorage() {
        System.out.println("-Attaching storage");
    }

    /**
     * This method attaches the camera
     */
    public void attachCamera() {
        System.out.println("-Attaching camera");
    }

    /**
     * This method encloses the case
     */
    public void EncloseCase() {
        System.out.println("-Enclosing phone case");
    }

    /**
     * This method sets the model of the phone
     * @param _name indicates the model of the phone
     */
    public void setName(String _name) {
        this.model = _name;
    }

    /**
     * This method returns the model of the phone
     * @return string that indicates model of the phone
     */
    public String getModel()  {
        return this.model;
    }
}
