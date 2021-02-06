/**
 * This class represents credit card payments in modern payment type
 */
public class modernTypeCard implements ModernPayment {


    /**
     * This method carries out credit card payments.
     * @param cardNo represents the 16-digit card number
     * @param amount represents the amount of credit card debt.
     * @param destination represents the location of destination
     * @param installments represents the number of installments for credit card payment.
     * @return 1 if the operation of payment is successful
     */
    @Override
    public int pay(String cardNo, float amount, String destination, String installments) {
        System.out.println("********* pay method of ModernPayment interface is working ***********");
        System.out.print("A payment of " + amount + "TL was made to the credit card number " + cardNo + " of the " + destination + " Bank ");
        System.out.println("and " + installments + " installments were made to payment.");
        System.out.println();
        return 1;
    }
}
