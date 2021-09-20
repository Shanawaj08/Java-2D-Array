/*Array Manipulation
Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each the array element between two given indices, inclusive. 
Once all operations have been performed, return the maximum value in the array. */

class Result {

    public void fillArray(long n, long[][] op, long m) {
        long[] arr = new long[(int)n];
        long k=0, val1=0, val2=0, val3=0, max=0;
        for(long i=0; i<n; i++) {
            arr[(int)i]=0;
        }
        //System.out.println(Arrays.toString(arr));
        for(long j=0; j<m; j++) {
            val1 = op[(int)j][(int)k];
            val2 = op[(int)j][(int)k+1];
            val3 = op[(int)j][(int)k+2];
            for(long i = val1; i<=val2; i++) {
                if(arr[(int)i-1]==0) arr[(int)i-1] = val3;
                else arr[(int)i-1]+=val3;
            }
            //System.out.println(Arrays.toString(arr));
        }
        for(long i=0 ;i<arr.length; i++) {
            if(arr[(int)i]>max) max = arr[(int)i];
        }
        System.out.println(max);
    }
}

public class Solution {
    public static void main(String[] args) {
        Result mn = new Result();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long noOfOperations = sc.nextLong();
        long[][] op = new long[(int)noOfOperations][3];
        for(long i=0; i<noOfOperations; i++) {
            for(long j=0; j<3 ;j++) {
                long elements = sc.nextInt();
                op[(int)i][(int)j] = elements;
            }
        }
        mn.fillArray(n,op,noOfOperations);
        
        
    }
}
