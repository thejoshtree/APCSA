import java.util.Random;

public class Dice {
    private int faceValue;
    private static final Random rand = new Random();

    // No-arg constructor
    public Dice() {
        this.faceValue = 1; // default
    }

    // Roll the dice
    public void roll() {
        faceValue = rand.nextInt(6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }

    // Main method to test just Dice
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();

        d1.roll();
        d2.roll();

        System.out.println("Dice test:");
        System.out.println("Die 1 = " + d1.getFaceValue());
        System.out.println("Die 2 = " + d2.getFaceValue());
        System.out.println("Sum = " + (d1.getFaceValue() + d2.getFaceValue()));
    }
}
