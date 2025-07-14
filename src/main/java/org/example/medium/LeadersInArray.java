package org.example.medium;

import org.example.general.InOutOperation;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadersInArray {
    public static ArrayList<Integer>
    printLeaders(int[] arr, int n){

        ArrayList<Integer> ans= new ArrayList<>();

        // Last element of an array is always a leader,
        // push into ans array.
        int max = arr[n - 1];

        ans.add(arr[n-1]);

        // Start checking from the end whether a number is greater
        // than max no. from right, hence leader.
        for (int i = n - 2; i >= 0; i--)
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }

        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        InOutOperation.takeInput(arr);
        printLeaders(arr,arr.length);
    }
}
