/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimaltobinary;

import java.util.Scanner;

/**
 *
 * @author Producer
 */
public class DecimalToBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 100");
        while(in.hasNextInt())
        {
            int a = in.nextInt();
            while(a < 1 || a > 100)
            {
                System.out.println("Invalid number, please try again: ");
                a = in.nextInt();
            }
            printBinary(a);
            System.out.println("\nEnter next number, q to exit");
        }
        
    }
    private static void printBinary(int b)
    {


       
    }
    
}
