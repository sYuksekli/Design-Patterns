/**
 * This is a adapter class, written to make the newly written interface compatible with the old interface.
 */
public class ModernPaymentAdapter implements TurboPayment {

    /**
     * Represents the new type payment
     */
    private ModernPayment modernPayment;

    /**
     * Constructor to initialize modernPayment object
     * @param _modernPayment indicates an object type of ModernType
     */
    public ModernPaymentAdapter (ModernPayment _modernPayment) {
        this.modernPayment = _modernPayment;
    }

    /**
     * This method represents payment of credit card and
     * it adapts the new payment method to the old method.
     * @param turboCardNo represents the 16-digit card number
     * @param turboAmount represents the amount of credit card debt.
     * @param destinationTurboOfCourse represents the location of destination
     * @param installmentsButInTurbo represents the number of installments for credit card payment.
     * @return
     */
    @Override
    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo) {
        return modernPayment.pay(turboCardNo,turboAmount,destinationTurboOfCourse,installmentsButInTurbo);
    }
}
