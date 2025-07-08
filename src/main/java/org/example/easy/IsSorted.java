package org.example.easy;

import org.example.general.InOutOperation;

import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the elements of array");
        InOutOperation.takeInput(arr);

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>=arr[i-1]){

            }else{
                System.out.println("no");
            }
        }
        System.out.println("yes");
    }
}
