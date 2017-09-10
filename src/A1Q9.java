
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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //intialize variables
        double average;
        double sum = 0;

        // Create a Scanner 
        Scanner input = new Scanner(System.in);

        //Create an array to store word entered by user 
        String[] word = new String[10];

        //Ask the user to enter ten words 
        System.out.println("Input ten words");

        //forloop to have the user input ten words
        for (int i = 0; i < word.length; i++) {
            word[i] = input.nextLine();
        }
        
        //calculate the length of each word 
        for (int i = 0; i < word.length; i++) {
            int length = word[i].length();
        }
        
        //calculate the sum of the charcters of the words in the array 
        for (int i = 0; i < word.length; i++) {
            sum += word[i].length();
        }
        
        //space
        System.out.println("");
        
        //calculate the average 
        average = sum / word.length;
        System.out.println("The Average word length is " + average);

    }

}
