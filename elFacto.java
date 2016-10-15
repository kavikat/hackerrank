/*
	determine factorials of N
	-decrement n until 0
	 - store all decremented values in array
	 	- multiply all values in array[N] by N
*/
import java.util.*;
import java.math.*;

public class elFacto{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] factorial = new int[n+1];
		long facto = 0;
		//BigInteger el = BigInteger.valueOf(facto.intValue());
		while(n>0){
				facto = n*n-1;
				n--;
		}
		System.out.println(facto);
	}
}