/**
 * This class represents market in Turkey in the area of smart phone
 */
public class TurkeySmartPhoneMarket extends SmartPhoneMarket {

    /**
     * This method manufactures a smart phone components
     * @param model indicates the model of the smart phone that will be manufactured.
     * @return a smart phone model
     */
    @Override
    protected SmartPhone produceSmartPhone(String model) {

        SmartPhone phone = null;
        SmartPhoneComponentsFactory components = new TurkeySmartPhoneComponentFactory();

        if (model.equalsIgnoreCase("MaximumEffortModel")) {
            phone = new MaximumEffortModel(components);
        }

        else if (model.equalsIgnoreCase("I_I_Aman_IflasModel")) {
            phone = new I_I_Aman_IflasModel(components);
        }

        else if (model.equalsIgnoreCase("IflasDeluxeModel")) {
            phone = new IflasDeluxeModel(components);
        }

        phone.produceComponents();
        return phone;
    }
}
