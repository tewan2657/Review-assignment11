
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Adars
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner 
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a number between 1 & 10
        System.out.println("Enter a Number between 1 & 10:");
        int num = input.nextInt();

        //Print out the asterisks acoording to the number given by the user
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <num; j++) {
            System.out.print("*");
           
        }
            //space
            System.out.println("");
        }
        
        
        
    }

}
