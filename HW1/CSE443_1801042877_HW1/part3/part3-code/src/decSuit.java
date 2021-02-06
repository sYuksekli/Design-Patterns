/**
 * This class represents dec type of suit
 */
public class decSuit extends Suit {

    /**
     * Constructor which initializes type of the suit
     */
    public decSuit() {
        type = "dec suit";
    }

    /**
     * This method returns the cost of the dec suit
     * @return a value that represents the cost of the suit
     */
    public double getCost() {
        return 500.0;
    }

    /**
     * This method returns the weight of the dec suit
     * @return a value that represents the weight of the suit
     */
    public double getWeight() {
        return 25.0;
    }
}
