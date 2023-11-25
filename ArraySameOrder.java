
package com.mycompany.sec.recusrion;

public class ArraySameOrder {
    
    public static void printSameArray(int arr[], int index)
    {
        if (index == arr.length)
        {
            return;
        }
        else
        {
            System.out.print(arr[index] + " ");
            printSameArray(arr, index + 1);
        }
    }

    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5};
        printSameArray(arr, 0);
    }
    
}
