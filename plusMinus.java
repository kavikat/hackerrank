import java.util.*;
import java.text.*;

public class plusMinus{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] frac = new int[size];
		//counter variables
		int pos=0, neg=0, zer=0;
		//fill array
		for(int i=0;i<frac.length;i++){
			frac[i] = sc.nextInt();
			if(frac[i] > 0){
				pos++;
			}
			else if(frac[i] < 0){
				neg++;
			}
			else{
				zer++;
			}
		}
		//print results
		NumberFormat formatter = new DecimalFormat("#0.000");
		System.out.println(formatter.format((double)pos/size));
		System.out.println(formatter.format((double)neg/size));
		System.out.println(formatter.format((double)zer/size));
	}
}