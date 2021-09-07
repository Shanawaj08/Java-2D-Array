/*Addition In Matrix 
Given a 2D array, Sum the elements of the array.
Input Format
You will taking two integers as input on one line separated by space representing rows and columns of the matrix. 
Following lines after that will be elements of the matrix with each element separated by space.*/

import java.io.*;
import java.util.*;
public class additionInMatrix {
    public static void main(String args[] ) throws Exception {
        int rows, cols, elements, sum=0;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt(); 
        cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                elements = sc.nextInt();
                arr[i][j] = elements;
            }
        }
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);

   }
}
