/*Hour Glass Sum
There are 16 hourglasses in array . An hourglass sum is the sum of an hourglass' values. 
Calculate the hourglass sum for every hourglass in array, then print the maximum hourglass sum. The array will always be 6*6 */

class Result {

    public static int hourGlassSum(int[][] a) {
        int max=-63;
        for (int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                int sum=0;
                sum+=a[i][j] + a[i][j+1] + a[i][j+2];
                sum+=a[i+1][j+1];
                sum+=a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
                if(sum>max) max=sum;
            }
            
        }
        return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        Result res = new Result();
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for(int i=0; i<6; i++) {
            for(int j=0; j<6; j++) {
                int val = sc.nextInt();
                arr[i][j] = val;
            }
        }
        System.out.println(res.hourGlassSum(arr));
    }
}


