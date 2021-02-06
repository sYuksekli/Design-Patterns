/**
 * Driver class to test program
 */
public class Main {

    public static void main(String[] args) {

        Suit suit1 = new decSuit();
        System.out.println("Type : " + suit1.getType() + "Cost : " + suit1.getCost() + "k TL" + " Weight : " + suit1.getWeight() + "kg");

        Suit suit2 = new oraSuit();
        suit2 = new Flamethrower(suit2);
        suit2 = new Laser(suit2);
        suit2 = new AutoRifle(suit2);
        suit2 = new RocketLauncher(suit2);
        System.out.println("Type : " + suit2.getType() + "Cost : " + suit2.getCost() + "k TL" + " Weight : " + suit2.getWeight() + "kg");


        Suit suit3 = new torSuit();
        suit3 = new Flamethrower(suit3);
        suit3 = new Laser(suit3);
        System.out.println("Type : " + suit3.getType() + "Cost : " + suit3.getCost() + "k TL" + " Weight : " + suit3.getWeight() + "kg");


        Suit suit4 = new torSuit();
        suit4 = new AutoRifle(suit4);
        System.out.println("Type : " + suit4.getType() + "Cost : " + suit4.getCost() + "k TL" + " Weight : " + suit4.getWeight() + "kg");

    }
}
