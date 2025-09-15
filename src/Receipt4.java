/**
 * Receipt4.java
 *
 * @author - Your Name
 * @author - Class Period
 *
 */
import java.util.Scanner;

public class Receipt4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the four-word name of the high school: ");
        String name = input.nextLine();

        int position = name.indexOf(" ");
        String first = name.substring(0, 1);
        name = name.substring(position + 1);

        position = name.indexOf(" ");
        String second = name.substring(0, 1);
        name = name.substring(position + 1);

        position = name.indexOf(" ");
        String third = name.substring(0, 1);
        String fourth = name.substring(position + 1, position + 2);

        String highSchoolName = first + second + third + fourth;
        double drinkCost = 1.5;
        double candyCost = 1.25;
        double hotDogCost = 2.75;
        double hamburgerCost = 3.5;
        double taxRate = 0.05;

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*              Welcome               *");
        System.out.println("*     " + highSchoolName + " Snack Bar     *");
        System.out.println("*                                    *");
        System.out.println("*     Drink ..............$ " + drinkCost +
                "      *");
        System.out.println("*     Candy ..............$ " + candyCost +
                "     *");
        System.out.println("*     Hot Dog ............$ " +
                hotDogCost + "     *");
        System.out.println("*     Hamburger ..........$ " + hamburgerCost +
                "      *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        System.out.print("Enter the number of drinks: ");
        int numDrinks = input.nextInt();

        System.out.print("Enter the number of candy bars: ");
        int numCandy = input.nextInt();

        System.out.print("Enter the number of hot dogs: ");
        int numHotDogs = input.nextInt();

        System.out.print("Enter the number of hamburgers: ");
        int numHamburgers = input.nextInt();

        int orderNumber = (int)(Math.random() * 100 + 1);

        double drinkTotal = numDrinks * drinkCost;
        double candyTotal = numCandy * candyCost;
        double hotDogTotal = numHotDogs * hotDogCost;
        double hamburgerTotal = numHamburgers * hamburgerCost;

        double subtotal = drinkTotal + candyTotal + hotDogTotal + hamburgerTotal;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;

        //  changes the values of the variables so they contain
        //        only 2 decimal places
        tax = (int)(tax * 100)/100.0;
        subtotal = (int)(subtotal * 100)/100.0;
        total = (int)(total * 100)/100.0;

        System.out.println("\n   Order Number    " +orderNumber);
        System.out.println();
        System.out.println("\tQTY\tITEM\t\tTOTAL");
        System.out.println("**************************************");
        System.out.println("\t" + numDrinks + "\tDrink\t\t" + drinkTotal);
        System.out.println("\t" + numCandy + "\tCandy\t\t" + candyTotal);
        System.out.println("\t" + numHotDogs + "\tHot Dog\t\t" + hotDogTotal);
        System.out.println("\t" + numHamburgers +"\tHamburger\t" + hamburgerTotal);
        System.out.println("**************************************");
        System.out.println("\tSubtotal\t " + subtotal);
        System.out.println("\tTax\t\t" + tax);
        System.out.println("\tTotal\t\t" + total);
    }
}