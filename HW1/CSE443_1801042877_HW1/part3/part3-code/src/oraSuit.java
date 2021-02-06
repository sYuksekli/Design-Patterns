/**
 * This class represents ora type of suit
 */
public class oraSuit extends Suit {

    /**
     * Constructor which initializes type of the suit
     */
    public oraSuit() {
        type = "ora suit";
    }

    /**
     * This method returns the cost of the ora suit
     * @return a value that represents the cost of the suit
     */
    public double getCost() {
        return 1500.0;
    }

    /**
     * This method returns the weight of the ora suit
     * @return a value that represents the weight of the suit
     */
    public double getWeight() {
        return 30.0;
    }


}
