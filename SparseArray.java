/*Sparse Array
There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings. 
Return an array of the results.*/

class Result {

    public void countStr(String[] str, String[] strQ) {
        int count = 0;
        int[] countStr = new int[strQ.length];
        for(int i=0; i<strQ.length; i++) {
            for(int j=0; j<str.length; j++) {
                if(str[j].equals(strQ[i])) {
                    count ++;
                    countStr[i] = count;
                    //System.out.println(countStr[i]);
                }
            }
            if(count==0) {
                countStr[i] = 0;
            }
            count = 0;
            
        }
        for(int i=0; i<countStr.length; i++) {
            System.out.println(countStr[i]);
        }
    }

}

public class Solution {
    public static void main(String[] args) {
        Result mn = new Result();
        Scanner sc = new Scanner(System.in);
        int strNo = sc.nextInt();
        String[] str = new String[strNo];
        sc.nextLine();
        for(int i=0; i<strNo; i++) {
            String strVal = sc.next();
            str[i] = strVal;
        }
        int strQno = sc.nextInt();
        String[] strQ = new String[strQno];
        sc.nextLine();
        for(int i=0; i<strQno; i++) {
            String strQVal = sc.next();
            strQ[i] = strQVal;
        }
        mn.countStr(str, strQ);
        
    }
}
