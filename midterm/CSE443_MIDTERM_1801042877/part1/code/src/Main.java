/**
 * Driver to test methods
 */
public class  Main {

    public static void main(String[] args) {

        SmartPhoneMarket marketInTurkey = new TurkeySmartPhoneMarket();
        SmartPhoneMarket marketInEU = new EUSmartPhoneMarket();
        SmartPhoneMarket marketInGlobal = new GlobalSmartPhoneMarket();


        // Test for ordering MaximumEffortModel smart phone im different markets
        System.out.println("* * * * * * TEST1 : ORDERING MaximumEffortModel SMART PHONE * * * * * * *\n");

        System.out.println("----- Customer1 orders MaximumEffort model smart phone in Turkey ------");
        marketInTurkey.orderSmartPhone("MaximumEffortModel");
        System.out.println("\nMaximumEffortModel Smart Phone was delivered successfully to customer1!\n\n");

        System.out.println("----- Customer2 orders MaximumEffort model smart phone in EU   ------");
        marketInEU.orderSmartPhone("MaximumEffortModel");
        System.out.println("\nMaximumEffortModel Smart Phone was delivered successfully to customer2!\n\n");

        System.out.println("----- Customer3 orders MaximumEffort model smart phone in Global ------");
        marketInGlobal.orderSmartPhone("MaximumEffortModel");
        System.out.println("\nMaximumEffortModel Smart Phone was delivered successfully to customer3!");

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n\n");




        // Test for ordering I_I_AmanIflasModel smart phone im different markets
        System.out.println("* * * * * * TEST2 : ORDERING I_I_AmanIflasModel SMART PHONE * * * * * * *\n");

        System.out.println("----- Customer4 orders I_I_Aman_IflasModel model smart phone in Turkey ------");
        marketInTurkey.orderSmartPhone("I_I_Aman_IflasModel");
        System.out.println("\nI_I_Aman_IflasModel Smart Phone was delivered successfully to customer4!\n\n");

        System.out.println("----- Customer5 orders I_I_Aman_IflasModel model smart phone in EU     ------");
        marketInEU.orderSmartPhone("I_I_Aman_IflasModel");
        System.out.println("\nI_I_Aman_IflasModel Smart Phone was delivered successfully to customer5!\n\n");

        System.out.println("----- Customer6 orders I_I_Aman_IflasModel model smart phone in Global ------");
        marketInGlobal.orderSmartPhone("I_I_Aman_IflasModel");
        System.out.println("\nI_I_Aman_IflasModel Smart Phone was delivered successfully to customer6!");

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n\n");


        // Test for ordering IflasDeluxeModel smart phone im different markets
        System.out.println("* * * * * * TEST3 : ORDERING IflasDeluxeModel SMART PHONE * * * * * * *\n");

        System.out.println("----- Customer7 orders IflasDeluxeModel model smart phone in Turkey ------");
        marketInTurkey.orderSmartPhone("IflasDeluxeModel");
        System.out.println("\nIflasDeluxeModel Smart Phone was delivered successfully to customer7!\n\n");

        System.out.println("----- Customer8 orders IflasDeluxeModel model smart phone in EU     ------");
        marketInEU.orderSmartPhone("IflasDeluxeModel");
        System.out.println("\nIflasDeluxeModel Smart Phone was delivered successfully to customer8!\n\n");

        System.out.println("----- Customer9 orders IflasDeluxeModel model smart phone in Global ------");
        marketInGlobal.orderSmartPhone("IflasDeluxeModel");
        System.out.println("\nIflasDeluxeModel Smart Phone was delivered successfully to customer9!");

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n\n");
    }
}
