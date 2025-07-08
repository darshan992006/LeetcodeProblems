package org.example.general;

import java.util.Scanner;

public class InOutOperation {
    static Scanner sc= new Scanner(System.in);
     public static void takeInput(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
