package org.example.medium;

public class MakingZero {

    public void setZeroes(int[][] matrix) {
        // using 2 sets
        // Set<Integer> zeroRows=new HashSet<>();
        // Set<Integer> zeroCols=new HashSet<>();
        // int rows=matrix.length;
        // int cols=matrix[0].length;
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         if(matrix[i][j]==0){
        //             zeroRows.add(i);
        //             zeroCols.add(j);
        //         }
        //     }
        // }

        // for(int row:zeroRows){
        //     for(int j=0;j<cols;j++){
        //         matrix[row][j]=0;
        //     }
        // }

        //    for(int col:zeroCols){
        //     for(int i=0;i<rows;i++){
        //         matrix[i][col]=0;
        //     }
        // }
        int n = matrix.length;
        int m = matrix[0].length;
        int col0 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
