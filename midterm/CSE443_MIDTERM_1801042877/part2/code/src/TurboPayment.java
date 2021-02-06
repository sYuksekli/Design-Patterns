/**
 * This interface represents credit card payments
 */
public interface TurboPayment {

    /**
     * This method carries out credit card payments.
     * @param turboCardNo represents the 16-digit card number
     * @param turboAmount represents the amount of credit card debt.
     * @param destinationTurboOfCourse represents the location of destination
     * @param installmentsButInTurbo represents the number of installments for credit card payment.
     * @return 1 if the operation of payment is successful
     */
    int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo);
}
