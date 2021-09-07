/*Count Odd (100 Marks)
Given a 2D array, count the odd numbers out of it.
Input Format
You will taking two integers as input on one line separated by space representing rows and columns of the matrix. 
Following lines after that will be elements of the matrix with each element separated by space.*/

import java.io.*;
import java.util.*;
public class CountOdd {
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
                if(matrix[i][j]%2!=0) count++;
            }
        }
        System.out.println(count);

   }
}
