/**
 * This class represents a type of accessories that can be equipped with suits
 */
public class Laser extends Accessories {

    /**
     * Suit reference to any type
     */
    Suit suit;

    /**
     * Constructor to initialize suit type
     * @param _suit represents the type of the suit
     */
    public Laser(Suit _suit) {
        this.suit = _suit;
    }

    /**
     * This method returns the type of the suit with accessories
     * @return type that represents the type of the suit
     */
    @Override
    public String getType() {
        return suit.getType() + ", Laser";
    }

    /**
     * This method returns the cost of the suit with accessories
     * @return a value that represents the total cost of the suit
     */
    @Override
    public double getCost() {
        return 200.0 + suit.getCost();
    }

    /**
     * This method returns the weight of the suit with accessories
     * @return a value that represents the total weight of the suit
     */
    @Override
    public double getWeight() {
        return 5.5 + suit.getWeight();
    }
}
