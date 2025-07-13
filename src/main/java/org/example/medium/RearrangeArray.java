package org.example.medium;

import org.example.general.InOutOperation;

import java.util.Scanner;

public class RearrangeArray {
    public static void main(String[] args) {
        System.out.println("enter the size ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums= new int[n];
        InOutOperation.takeInput(nums);
        int n2=nums.length;
        int[] ans= new int[n];
        int posIndx=0; int negIndx=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[negIndx]=nums[i];
                negIndx+=2;
            }else{
                ans[posIndx]=nums[i];
                posIndx+=2;
            }
        }
        System.out.println(ans);
    }
}
