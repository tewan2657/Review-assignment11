
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

        //Create an array for the Prices of each expenses 
        double[] cost = new double[6];

       
       //Ask the user for the cost of food 
        System.out.println("what is the cost for food?");
         cost[0] = input.nextDouble();
        
        //Ask the user for the cost of the DJ
         System.out.println("What is the cost of the Dj?");
         cost[1] = input.nextDouble();
         
         //Ask the user for the cost of the hall rental 
         System.out.println("What is the cost of the hall rental?");
         cost[2] = input.nextDouble();
         
         //Ask the user for the cost of the decorations
         System.out.println("what is the cost of the decorations");
         cost[3] = input.nextDouble();
         
         //Ask the user for the cost of the wait staff
         System.out.println("What is the cost of the wait staff");
 

    }
}
