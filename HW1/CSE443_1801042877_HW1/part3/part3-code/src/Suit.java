/**
 * This abstract class represents exoskeleton armored suits
 */
public abstract class Suit {

    /**
     * Represents the type of the suit
     */
    String type = " ";

    /**
     * This method returns the type of the suit
     * @return type that represents the type of the suit
     */
    public String getType() {
        return type;
    }

    /**
     * This abstract method returns the cost of the suit
     */
    public abstract double getCost();

    /**
     * This abstract method returns the weight of the suit
     */
    public abstract double getWeight();
}
