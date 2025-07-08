package org.example.easy;

import org.example.general.InOutOperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ConsicutiveOnes {
    public static void counting(int[] arr,ArrayList<Integer> x){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                count++;
            }else{
                x.add(count);
                count=0;
            }
        }
        x.add(count);
    }
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] binaryArray= new int[n];
        InOutOperation.takeInput(binaryArray);
        ArrayList<Integer> windowsLength=new ArrayList<>();

        ConsicutiveOnes.counting(binaryArray,windowsLength);
        Integer max = Collections.max(windowsLength);
        System.out.println(max);
    }
}
