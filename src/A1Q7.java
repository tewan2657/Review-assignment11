
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
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //intialize variables
        int year = 1999;
        double k = 6;

        //add growing rate each year until population reaches 10 billion 
        while (k <= 10) {
            k += k * (1.4 / 100);
            year++;
        }
        System.out.println("The population will reach 10 billion in " + year);
    }

}
