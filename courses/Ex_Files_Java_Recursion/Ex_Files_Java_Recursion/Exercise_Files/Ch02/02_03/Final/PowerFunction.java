/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powerfunction;

import java.util.Scanner;


/**
 *
 * @author Producer
 */
public class PowerFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Enter your base number and exponent:");
        double number = in.nextDouble();
        int exp = in.nextInt();
        System.out.println(power(number, exp));
    }
    private static double power(double x, int n)
    {
        double y;
        if(n==0)
            return 1.0;
        y = power(x, n/2);
        y = y*y;
        if(n % 2 == 0 )
            return y;
        return x * y;
        
    }

}
