/**
 * This class represents tor type of suit
 */
public class torSuit extends Suit {

    /**
     * Constructor which initializes type of the suit
     */
    public torSuit() {
        type = "tor suit";
    }

    /**
     * This method returns the cost of the tor suit
     * @return a value that represents the cost of the suit
     */
    public double getCost() {
        return 5000.0;
    }

    /**
     * This method returns the weight of the tor suit
     * @return a value that represents the weight of the suit
     */
    public double getWeight() {
        return 50.0;
    }
}
