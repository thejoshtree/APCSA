/** create a Dice class, dice can roll for different random integers,
 * arguments: number of faces
 * attributes: faceValue
 * methods: roll, getFaceValue
 * precondition: random rolled, needs math.random() method
 */
import java.util.Scanner;
public class Dice {

// declare attributes
    private int faceValue;
    private int numberOfFaces;
// create a method called Dice, which will be same name as your class

    public Dice(int sides){
        numberOfFaces = sides;
    }
// roll method for a random number within the sides range
    public void roll(){
        faceValue = (int)(Math.random()* numberOfFaces)+1;
    }
// read the rolled number
    public int getFaceValue(){
        return faceValue;
    }
// create a void main class to run the code
    public static void main(String[] args){
        // ask user to input the number of dice sides.
        System.out.println("How many sides of the dice do you want?");
        Scanner sc = new Scanner(System.in);
        int numSides = sc.nextInt();

        // create a new dice object d1
        Dice d1 = new Dice(numSides);

        // call d1 roll method
        d1.roll();

        // call d1 FaceValue using the getFaceValue method
        int luckNumber = d1.getFaceValue();

        // print out the face value
        System.out.println("The rolled dice value is "+luckNumber);
    }

}
