package org.example.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangleProblems {

/*    1st verity of question
       you have given a row and colum from pascal triangle and you have to find out the element
       that element on that row and column
       solution is:-
       find out the value of r-1Cc-1
 */

    /*
    second verity:-print the Nth row of pascal's triangle
     */
    /*
   3rd verity:generate row one by one and add it to list to generate list of all row to print
   pascal triangle
     */
    public static int NcR(int n,int r){
        int res=1;
        for (int i = 0; i < r; i++) {
            res*=(n-i);
            res/=(i+1);
        }
        return  res;
    }
    public static void printNthRow(int n){
        int ans=1;
        System.out.print(ans);
        for (int i = 1; i < n; i++) {
            ans*=(n-i);
            ans/=i;
            System.out.print(ans);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row&column");
        int R=sc.nextInt();
        int C=sc.nextInt();
        int ans=NcR(R-1,C-1);
        System.out.println(ans);
        System.out.println("enter the number of row");
        int n=sc.nextInt();
        printNthRow(n);
        List<Integer> x=new ArrayList<>();
    }
}
