
package com.mycompany.sec.recusrion;

import java.util.Scanner;

public class Factorial {
    
    public static long Fact(int n)
    {
        long fact = 1;
        if (n > 1)
        {
            fact = n * Fact(n - 1);
        }
        return fact;
    }

    public static void main(String[] args) {
        long val;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number to know its factorial: ");
        val = Fact(s.nextInt());
        System.out.println("Factorial = " + val);
    }
}
