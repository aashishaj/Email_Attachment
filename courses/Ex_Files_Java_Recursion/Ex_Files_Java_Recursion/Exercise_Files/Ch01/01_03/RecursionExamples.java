/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionexamples;

import java.util.Scanner;

/**
 *
 * @author Producer
 */
public class RecursionExamples {
        static Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //use recursion to print a list in reverse order
        int[] numList = {10,20,30,40,50};
        reversePrint(numList);
        System.out.println("");
        
        //use recursion to find the factorial of a number
//        System.out.println("Enter a number for the factorial problem: ");
//        int f = in.nextInt();
//        System.out.println("Factorial of 5 is: "+factorial(f));
        
        //call GCD
//        System.out.println("Enter two numbers and I'll find the GCD");
//        int x = in.nextInt();
//        int y = in.nextInt();
//        System.out.println(Greatest(x,y));
        
    }
    private static void reversePrint(int[] numbers)
    {
        if (numbers.length == 0)
			return;
		int i;
		int[] a = new int[numbers.length-1];
		for( i=0; i<numbers.length-1;i++)
			a[i]=numbers[i];
		reversePrint(a);
		System.out.println(numbers[0]);
    }
    private static int factorial(int b)
    {
       
    }
    /*
    Greatest Common denominator recursive function
    based on Euclid
    */
    private static int Greatest(int a, int b)
    {
       
    }
    
}
