
package com.mycompany.sec.recusrion;

public class MaximumInArray {
    
    public static int max(int arr [], int n)
    {
        if (n == 1)
        {
            return arr[0];
        }
        else 
        {
            return Math.max(arr[n - 1], max(arr, n - 1));
        }
    }

    public static void main(String[] args) {
        int arr [] = {1, 3, 5, 7, 2};
        System.out.println(max(arr, arr.length));
    }
    
}
