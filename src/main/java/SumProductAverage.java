/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers 
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

import java.util.Scanner;

public class SumProductAverage {
    public static void main(String[] args) {
        // TODO
        //Signature
        System.out.println ("Michael Meerovich");
        System.out.println ("APCS-A");
        System.out.println ("Lewis 2.2-2.3 Arithmetic");
        System.out.println ();
        System.out.println ();

        //Create Scanner Input
        Scanner sc = new Scanner(System.in);

        //Declare Variables
        double num1, num2, num3, avg, sum, product;
        int numruns;

        //Prompt the user for the number of runs
        System.out.print ("How many runs should the program have:  ");
        numruns = sc.nextInt ();
        System.out.println ();
        System.out.println ();

        //Repeat Program
        for (int k = 0; k < numruns; k++)
        {
            //Input the numbers
            System.out.print ("Input the first number:  ");
            num1 = sc.nextDouble ();
            System.out.print ("Input the second number:  ");
            num2 = sc.nextDouble ();
            System.out.print ("Input the third number:  ");
            num3 = sc.nextDouble ();
            System.out.println ();

            //Calculate the sum, average, and product
            sum = num1 + num2 + num3;
            avg = sum / 3;
            product = num1 * num2 * num3;

            //Output the values
            System.out.println ("The average of the numbers is:  " + avg);
            System.out.println ("The sum of the numbers is:  " + sum);
            System.out.println ("The product of the numbers is:  " + product);
            System.out.println ();
            System.out.println ();
        }
    }
}
