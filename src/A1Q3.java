
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Ask the user for the cost of food 
        System.out.println("what is the cost for food?");
        double food = input.nextDouble();

        //Ask the user for the cost of the DJ
        System.out.println("What is the cost of the Dj?");
        double Dj = input.nextDouble();

        //Ask the user for the cost of the hall rental 
        System.out.println("What is the cost of the hall rental?");
        double hall = input.nextDouble();

        //Ask the user for the cost of the decorations
        System.out.println("what is the cost of the decorations?");
        double deco = input.nextDouble();

        //Ask the user for the cost of the wait staff
        System.out.println("What is the cost of the wait staff?");
        double staff = input.nextDouble();

        //Ask the user for the cost of the miscellaneous expenses 
        System.out.println("What is the cost of the miscellaneous expenses?");
        double mis = input.nextDouble();

        //Calculate Total price and print 
        double total = food + Dj + hall + deco + staff + mis;
        System.out.println("The total is " + total);

        //Ask the user fot the cost of one ticket
        System.out.println("What is the cost of one ticket?");
        double ticket = input.nextDouble();

        //Finding how many tickets are required to break even and print the answer
        int even = (int) (Math.ceil(1.0 * total / ticket));
        System.out.println("You will need to sell " + even + " tickets to break even ");




    }
}
