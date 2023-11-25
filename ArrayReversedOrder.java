
package com.mycompany.sec.recusrion;

public class ArrayReversedOrder {
    
    public static void printReversedArray(int arr[], int start, int end)
    {
        if (start > end)
        {
            return;
        }
        printReversedArray(arr, start + 1, end);
        System.out.print(arr[start] + " ");
        
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        printReversedArray(arr, 0, arr.length - 1);
    }
    
}
