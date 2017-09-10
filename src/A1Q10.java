
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
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //intialize variables
        int counter = 0;

        // Create A scanner 
        Scanner input = new Scanner(System.in);

        while (true) {

            //Ask the user to Input a Word
            System.out.println("Input a Word");

            //Have the user input words
            String word = input.nextLine();

            //If user inputs exit, break
            if (word.equals("exit")) {

                System.out.println("You have typed in " + counter + " words.");
                break;

                //for every other word typed in by user, increment
            } else {
                counter++;
            }

            //If the first letter of each word is uppercase, true 
            if (Character.isUpperCase(word.charAt(0))) {
                System.out.println("True!");

                //space
                System.out.println("");

                //if it is not uppercase then False!
            } else {
                System.out.println("False!");

                //space
                System.out.println("");
            }
        }

 }
}
