/**
 * This class represents market in the area of smart phone
 */
public abstract class SmartPhoneMarket {

    /**
     * This method manufactures a smart phone components
     * @param model indicates the model of the smart phone that will be manufactured.
     * @return a smart phone model
     */
    protected abstract SmartPhone produceSmartPhone(String model);

    /**
     * This method provides user to order a smart phone
     * @param model indicates the model of the smart phone that will be ordered.
     * @return a smart phone model
     */
    public SmartPhone orderSmartPhone(String model) {

        SmartPhone phone;
        phone = produceSmartPhone(model);

        System.out.println("\nConstructing components");
        phone.attachCPU_RAMtoBoard();
        phone.attachDisplay();
        phone.attachBattery();
        phone.attachStorage();
        phone.attachCamera();
        phone.EncloseCase();

        return phone;
    }
}
