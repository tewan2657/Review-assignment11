
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner 
        Scanner input = new Scanner(System.in);

        //Ask the user to choose a number between 1 & 10
        System.out.println("Choose a Number between 1 & 10");
        int num = input.nextInt();

        //Print out asterisks acoording to the number given by user 
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
            //space
            System.out.println("");
        
    }
}
