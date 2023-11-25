
package com.mycompany.sec.recusrion;

import java.util.Scanner;

public class Sum {

    public static long getSum(int n)
    {
        if ( n == 1)
        {
            return 1;
        }
        else 
        {
            return n + getSum(n - 1);
        }
    }
    public static void main(String[] args) {
        long ans;
        Scanner s = new Scanner(System.in);
        ans = getSum(s.nextInt());
        System.out.println(ans);
    }
    
}
