package org.example.easy;

import org.example.general.InOutOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element in array1");
        int n1 = sc.nextInt();
        System.out.println("enter the number of element in array2");
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        System.out.println("enter the element of array1");
        InOutOperation.takeInput(arr1);
        System.out.println("enter the element of array2");
        InOutOperation.takeInput(arr2);
        List<Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (union.size() == 0 || union.get(union.size()-1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (union.size() == 0 || union.get(union.size()-1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            }
        }
        while (i < n1) // IF any element left in arr1
        {
            if (union.get(union.size()-1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }
        while (j < n2) // If any elements left in arr2
        {
            if (union.get(union.size()-1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }
        System.out.println("union of array 1 and array2 is: "+union);
    }
}
