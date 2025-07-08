package org.example.easy;

import org.example.general.InOutOperation;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the elements of array");
        InOutOperation.takeInput(arr);

        int largest=arr[0];
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
            if (arr[i]<smallest){
                smallest=arr[i];
            }
        }

        System.out.println("largest element from array is: "+largest);
        System.out.println("smallest element from array is: "+smallest);
    }
}
