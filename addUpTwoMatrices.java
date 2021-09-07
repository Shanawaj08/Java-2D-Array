/*Add up two matrices
For this challenge, you need to take 2 matrices as an input the stdin , add them and print the resultant matrix to the stdout.
Input Format
Two matrices to be taken as an input.For each matrix, on first line you need to tell that how many rows and columns your matrix need to have and these values should be separated by space.
Then after that, each line will represent will represent each row and you need to enter numbers which each rows should have separated by a space.*/

import java.io.*;
import java.util.*;
public class addUpTwoMatrices {
    public static void main(String args[] ) throws Exception {
        int rows, cols, rows1, cols1, elements;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        cols = sc.nextInt();
        int[][] arr1 = new int[rows][cols];
        int[][] res = new int[rows][cols];
        for (int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                elements = sc.nextInt();
                arr1[i][j] = elements;
            }
        }
        rows1 = sc.nextInt();
        cols1 = sc.nextInt();
        int[][] arr2 = new int[rows1][cols1];
        if(rows==rows1 && cols==cols1) {
            for (int i=0; i<rows1; i++) {
                for(int j=0; j<cols1; j++) {
                    elements = sc.nextInt();
                    arr2[i][j] = elements;
                }   
            }
            for (int i=0; i<arr1.length; i++) {
                for(int j=0; j<arr1[i].length; j++) {
                    res[i][j]=arr1[i][j] + arr2[i][j];
                }
            }
            for (int i=0; i<res.length; i++) {
                for(int j=0; j<res[i].length; j++) {
                    System.out.print(res[i][j] + " ");

                }
                System.out.println();
    
            }
        }
        
    }
}
