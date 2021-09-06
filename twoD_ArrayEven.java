/*Given a 2D array, print the even numbers of it.

Input Format
You will taking two integers as input on one line separated by space representing rows and columns of the matrix. Following lines after that will be elements of the matrix with each element separated by space.

Constraints
1 <= n,m <= 1000

Output Format
Print the even elements of the matrix with each element separated by space.*/

import java.io.*;
import java.util.*;
public class twoD_ArrayEven {
    public static void main(String args[] ) throws Exception {
        int rows, cols, elements;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                elements=sc.nextInt();
                arr[i][j]=elements;
            }
        }//System.out.println(Arrays.deepToString(arr));
        
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if(arr[i][j]%2==0) System.out.print(arr[i][j] + " ");
            } 
        }


   }
}
