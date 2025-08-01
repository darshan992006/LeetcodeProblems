package org.example.hard;

import org.example.general.InOutOperation;
import java.util.HashMap;
import java.util.Scanner;

public class FindMissingAndRepeatingNumber {

    // 2 optimal approaches
//        1st-using maths
    public static int[] findMissingRepeatingNumbers(int[] a) {
        long n = a.length; // size of the array
        // Find Sn and S2n:
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        // Calculate S and S2:
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += a[i];
            S2 += (long)a[i] * (long)a[i];
        }

        //S-Sn = X-Y:
        long val1 = S - SN;

        // S2-S2n = X^2-Y^2:
        long val2 = S2 - S2N;

        //Find X+Y = (X^2-Y^2)/(X-Y):
        val2 = val2 / val1;

        //Find X and Y: X = ((X+Y)+(X-Y))/2 and Y = X-(X-Y),
        // Here, X-Y = val1 and X+Y = val2:
        long x = (val1 + val2) / 2;
        long y = x - val1;

        int[] ans = {(int)x, (int)y};
        return ans;
    }

//    2nd approach
//    using xor operator

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int missingNum = 0;
        int repeatingNum = 0;
        int num = sc.nextInt();
        int[] nums = new int[num];
        InOutOperation.takeInput(nums);
//        using brute force approach

//using hashing
//        HashMap<Integer, Integer> mp = new HashMap<>();
//        for (int i = 0; i < num; i++) {
//            int key = nums[i];
//            int freq = mp.getOrDefault(key, 0);
//            mp.put(key, freq + 1);
//        }
//
//        for (int i = 1; i <= num; i++) {
//            if (mp.containsKey(i)) {
//                if (mp.get(i) > 1) {
//                    repeatingNum = i;
//                }
//            } else {
//                missingNum = i;
//            }
//        }
//
//        System.out.println("missing num: " + missingNum);
//        System.out.println("repeating num: " + repeatingNum);


    }
}
