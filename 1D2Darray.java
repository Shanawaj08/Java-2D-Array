/*Given a integer n. We have n*n values of a 2-d array, and  n values of 1-d array. 
Task is to find the sum of the left diagonal values of the 2-d array and the max element of the 1-d array and print them with space in between.*/

class Complete
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int sum = 0, max=0, j=0;
        for(int i=0; i<n; i++) {
            sum+=a[i][j];
            j++;
        }
        
        for(int i=0; i<b.length; i++) {
            if(b[i]>max) max = b[i];
        }
        numbers.add(sum);
        numbers.add(max);
        
        return numbers;
    }
}
