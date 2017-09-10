
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Create a Scanner   \
     Scanner input = new Scanner(System.in); 
     
     //Ask the user to enter a number between 50 and 100
        System.out.println("Enter a number between 50 and 100:");
        double num = input.nextDouble();
        
        //space
        System.out.println("");
        
        //Subtarct 5 from 100 until it does not reach the user's number 
        for (int i = 100; i >= num; i = i - 5 ) {
            System.out.println(i);
        }
        
    }    
}
