package org.example.medium;

import org.example.general.InOutOperation;

import java.util.Scanner;

public class SortArrayOfZeroOnesAndTwo {
    /*so in this question we have to sort an array of 0's 1's and 2's, so we can break
    down the problem's solution into three parts brute, better and optimized
    */
    // brute approach says-use any kind of soring technique probably merge sort or quick sort with
    //the time complexity of O(NlogN)

    //better

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of the array");
//        int n=sc.nextInt();
//        int[] arr = new  int[n];
//        System.out.println("please,enter the elements of an array which can only be 0,1,2");
//        InOutOperation.takeInput(arr);
//
//        int c0=0;
//        int c1=0;
//        int c2=0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==0){
//                c0++;
//            } else if (arr[i]==1) {
//                c1++;
//            }else {
//                c2++;
//            }
//        }
//
//        for (int i = 0; i < c0; i++) {
//            arr[i]=0;
//        }
//        for (int i = c0; i < c0+c1; i++) {
//            arr[i]=1;
//        }
//        for (int i = c0+c1; i < arr.length; i++) {
//            arr[i]=2;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//    }

    //optimal
    // Dutch national flag algorithm
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr = new  int[n];
        System.out.println("please,enter the elements of an array which can only be 0,1,2");
        InOutOperation.takeInput(arr);

        int low=0;
        int mid=0;
        int high=arr.length-1;

        while (mid<=high){
            if (arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }else if (arr[mid]==1){
                mid++;
            }else {
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
