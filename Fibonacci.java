
package com.mycompany.sec.recusrion;

public class Fibonacci {

    public static int Fib(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        else 
        {
            return Fib(n - 1) + Fib(n - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println(Fib(7));
    }
    
}
