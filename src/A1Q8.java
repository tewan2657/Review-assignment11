
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
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //intialize Variables
        int mill = 1000000;
        int year = 0;

        // Create a Scanner 
        Scanner input = new Scanner(System.in);

        //Ask the user to enter an Intial Amount 
        System.out.println("Enter an Intial Amount");
        double In = input.nextDouble();

        //variable
        double doubleIn = 2 * In;

        //Ask the user to enter an interest rate
        System.out.println("Enter an Interest Rate");
        double R = input.nextDouble();

        //calculate the number of years until money doubles 
        while (In <= doubleIn) {
            In += In * (((1 + R)) / 100);
            year++;

        }
        System.out.println("It will take " + year + " years until the money doubles.");

        //calculate the number of years until money reaches one million dollars 
        while (In <= mill) {
            In += In * (((1 + R)) / 100);
            year++;
        }
        System.out.println("It will take " + year + " years until the money reaches one million dollars.");
    }

}
