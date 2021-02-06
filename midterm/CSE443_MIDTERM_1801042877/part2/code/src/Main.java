/**
 * Driver class to test methods
 */
public class Main {

    public static void main(String[] args) {

        System.out. println();

        modernTypeCard modern_payment = new modernTypeCard();
        System.out.println("-------------- TESTİNG OF CARD PAYMENT USING NEW STYLE WHICH IS MODERN PAYMENT ----------------");
        modern_payment.pay("6789345667893456",100,"Kartal","2");

        turboTypeCard turbo_payment = new turboTypeCard();
        TurboPayment modern_adapter = new ModernPaymentAdapter(modern_payment);

        System.out.println("-------------- TESTİNG OF CARD PAYMENT USING OLD STYLE WHICH IS TURBO PAYMENT ----------------");
        turbo_payment.payInTurbo("1234567812345678",500,"Maltepe","3");

        System.out.println("-------------- TESTİNG OF CARD PAYMENT USING ADAPTER CLASS ----------------");
        modern_adapter.payInTurbo("1230456789896545",(float) 250.30,"Kadıköy","4");

        System.out.println();

        // Additional tests
        System.out.println("-------------- ADDITIONAL TESTS USING STATIC TEST METHOD  ----------------");
        test(turbo_payment);
        test(modern_adapter);

    }

    public static void test(TurboPayment turboPayment) {
        turboPayment.payInTurbo("4867379920562478",(float) 345.60,"Pendik","5");
    }
}