
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner  
        Scanner input = new Scanner(System.in);

        //Ask the user to enter 3 Numbers
        System.out.println("Enter 3 Numbers.");

        //create an array 
        double[] num = new double[3];
        num[0] = input.nextDouble();
        num[1] = input.nextDouble();
        num[2] = input.nextDouble();

        // Calculate the Product of the Numbers and print 
        double multi = num[0] * num[1] * num[2];
        System.out.println("The Product of the Numbers is " + multi);

        System.out.println("");
        
        //Calculate the square of the product 
        double square = Math.pow(multi, 2);
        System.out.println("The square of the product is " + square);
        
        System.out.println("");

        //Calculate the square root of the product
        double sRoot = Math.sqrt(multi);
        System.out.println("The square root of the product is " + sRoot);
        
        System.out.println("");
    }
}
