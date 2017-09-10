
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
        //Create a Scanner 
        Scanner input = new Scanner(System.in);
         
        //intialize variables
        double k;
        double temp; 
       temp = 6;
        for (double i= 6; i <= 48; i++ ) {
          k = temp*0.014 + temp;
          temp=k;
          
          System.out.println(k);
            }
    }
    
}
