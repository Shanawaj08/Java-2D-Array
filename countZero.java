/*Zeros Are Heros 
You are given a matrix with M rows and N columns. 
Elements in matrix can be either 1 or 0. Each row and column of matrix is sorted in ascending order. 
Find number of 0-s in the given matrix*/

import java.io.*;
import java.util.*;
public class countZero {
    public static void main(String args[] ) throws Exception {
        int count=0, rows, cols, elements;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                elements = sc.nextInt();
                matrix[i][j] = elements;
            }
        }
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                if(matrix[i][j]==0) count++;
            }
        }
        System.out.println(count);
   }
}
