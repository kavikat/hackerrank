import java.util.*;

public class bigSum{    

    public static void main (String [] args){
        long n = 0, sum = 0;
        long[] sums;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        sums = new long[n];
        //add values to array
        for (int i=0;i < n;i++) {
            sums[i] = in.nextDouble();
        }
        //add values to array
        for (int j=0;j < n;j++) {
            sum += sums[j];
        }
        System.out.println(sum);
    }
}