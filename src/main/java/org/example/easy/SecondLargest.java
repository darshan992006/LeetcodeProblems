package org.example.easy;

import org.example.general.InOutOperation;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the elements of array");
        InOutOperation.takeInput(arr);
        int largest=arr[0];
        int secondLargest=-1;
        int smallest=arr[0];
        int secondSmallest=Integer.MAX_VALUE;
        //better approach 
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>largest){
//                largest=arr[i];
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>secondLargest&& arr[i]!=largest){
//                secondLargest=arr[i];
//            }
//        }
//        System.out.println("second largest element is: "+secondLargest);
        
        //optimal approach
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest=arr[i];
            }

            if (arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            } else if (arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest=arr[i];
            }
        }
        System.out.println("second largest element is: "+secondLargest);
        System.out.println("second smallest element is: "+secondSmallest);
    }
}
