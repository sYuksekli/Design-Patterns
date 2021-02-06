/**
 * This interface represents credit card payments
 */
public interface ModernPayment {

    /**
     * This method carries out credit card payments.
     * @param cardNo represents the 16-digit card number
     * @param amount represents the amount of credit card debt.
     * @param destination represents the location of destination
     * @param installments represents the number of installments for credit card payment.
     * @return 1 if the operation of payment is successful
     */
    int pay(String cardNo, float amount, String destination, String installments);
}
