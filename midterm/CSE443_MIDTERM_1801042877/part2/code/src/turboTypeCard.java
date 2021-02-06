/**
 * This class represents credit card payments in turbo payment type
 */
public class turboTypeCard implements TurboPayment {

    /**
     * This method carries out credit card payments.
     * @param turboCardNo represents the 16-digit card number
     * @param turboAmount represents the amount of credit card debt.
     * @param destinationTurboOfCourse represents the location of destination
     * @param installmentsButInTurbo represents the number of installments for credit card payment.
     * @return 1 if the operation of payment is successful
     */
    @Override
    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo) {
        System.out.println("********* payInTurbo method of TurboPayment interface is working ***********");
        System.out.print("A payment of " + turboAmount + "TL was made to the credit card number " + turboCardNo + " of the ");
        System.out.println(destinationTurboOfCourse + " Bank and " + installmentsButInTurbo + " installments were made to payment.");
        System.out.println();
        return 1;
    }
}
