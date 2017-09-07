
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a Scanner 
        Scanner input = new Scanner(System.in);
        
        //ask the user for their name
        System.out.println("What is your name?");
        String name = input.nextLine();
        
        //Say Hello to user
        System.out.println("Hello " + name + "!" );
    }
}
