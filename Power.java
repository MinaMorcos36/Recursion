
package com.mycompany.sec.recusrion;

import java.util.Scanner;

public class Power {

    public static long Power(int x, int y)
    {
        if(y == 0)
        {
           return 1;
        }
        else 
        {
            return x * Power(x,  y - 1);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(Power(s.nextInt(),s.nextInt()));
                
    }
    
}
