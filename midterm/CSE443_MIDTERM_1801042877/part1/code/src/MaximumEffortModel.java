/**
 * This class represent a smart phone model called MaximumEffort
 */
public class MaximumEffortModel extends SmartPhone {

    /**
     * Represents the factory that the component will be produced.
     */
    private SmartPhoneComponentsFactory components;

    /**
     * Constructor to set factory
     * @param _components indicates the factory that the component will be produced.
     */
    public MaximumEffortModel(SmartPhoneComponentsFactory _components) {
        this.components = _components;
        model = "MaximumEffortModel Smart Phone";
    }

    /**
     * This method manufactures the necessary components to make a smart phone
     */
    @Override
    public void produceComponents() {

        System.out.println();
        System.out.println("Producing components for " + model);

        cpu_ram = components.produceCPU_RAM();
        System.out.println("-" + cpu_ram.manufacture());

        display = components.produceDisplay();
        System.out.println("-" + display.make());

        battery = components.produceBattery();
        System.out.println("-" + battery.produce());

        storage = components.produceStorage();
        System.out.println("-" + storage.fabricate());

        camera = components.produceCamera();
        System.out.println("-" + camera.manufacture());

        Case = components.produceCase();
        System.out.println("-" + Case.make());
    }
}
