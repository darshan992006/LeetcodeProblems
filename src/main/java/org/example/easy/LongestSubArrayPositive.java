package org.example.easy;


//Brute

//public class LongestSubArrayPositive {
//    public static int getLongestSubarray(int []a, long k) {
//        int n = a.length; // size of the array.
//
//        int len = 0;
//        for (int i = 0; i < n; i++) { // starting index
//            long s = 0; // Sum variable
//            for (int j = i; j < n; j++) { // ending index
//                // add the current element to
//                // the subarray a[i...j-1]:
//                s += a[j];
//
//                if (s == k)
//                    len = Math.max(len, j - i + 1);
//            }
//        }
//        return len;
//    }
//    public static void main(String[] args) {
//        int[] a = {2, 3, 5, 1, 9};
//        long k = 10;
//        int len = getLongestSubarray(a, k);
//        System.out.println("The length of the longest subarray is: " + len);
//    }
//}

//Better
//so this better approach works for both positive and negative integer's of array, and it's
// optimal approach for problem where array contains both negative and positive integers

import org.example.general.InOutOperation;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

//public class LongestSubArrayPositive {
//    public static int longestSubArray(int[] arr,long k){
//        int n=arr.length;
//        int maxLen = 0;
//        long sum=0;
//        Map<Long,Integer> preSumMap=new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            sum+=arr[i];
//            if (sum==k){
//                maxLen=Math.max(maxLen,i+1);
//            }
//            long rem=sum-k;
//            if (preSumMap.containsKey(rem)){
//                int len=i-preSumMap.get(rem);
//                maxLen=Math.max(maxLen,len);
//            }
//            if (!preSumMap.containsKey(sum)){
//                preSumMap.put(sum,i);
//            }
//        }
//
//        return maxLen;
//    }
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter the size of array");
//        int n= scanner.nextInt();
//        int[] arr= new int[n];
//        InOutOperation.takeInput(arr);
//        System.out.println("enter the sum k: ");
//        int k=scanner.nextInt();
//        int maxlen = LongestSubArrayPositive.longestSubArray(arr, k);
//        System.out.println(maxlen);
//    }
//}

//Optimal-approach if array contains only positive and zeros
public class LongestSubArrayPositive {
    public static int longestSubArray(int[] arr,long k){
        int maxLen=0;
        long sum=arr[0];
        int left=0;
        int right=0;
        int n=arr.length;
        while (right<n){
            while (left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if (sum==k){
                maxLen=Math.max(maxLen,right-left+1);
            }
            right++;
            if (right<n){
                sum+=arr[right];
            }
        }

        return maxLen;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= scanner.nextInt();
        int[] arr= new int[n];
        InOutOperation.takeInput(arr);
        System.out.println("enter the sum k: ");
        int k=scanner.nextInt();
        int maxlen = LongestSubArrayPositive.longestSubArray(arr, k);
        System.out.println(maxlen);

    }
}