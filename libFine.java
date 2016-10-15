/*
		get return date,
		- compare return date with expected return date
			-if return date is before or on the expected date, do nothing
			-if return date day is greater than expected date but month is same
				- fine 15* (return date - expected day)
			-if return day year is same as expected date,
				-fine 500 (return month - expected month)
			-if return year is greater than expected year
				- fine 10000
*/
import java.util.*;

public class libFine{
	public static void main( String [] args ){
		Scanner sc = new Scanner(System.in);
		int aDay = sc.nextInt();
		int aMonth = sc.nextInt();
		int aYear = sc.nextInt();
		int eDay = sc.nextInt();
		int eMonth = sc.nextInt();
		int eYear = sc.nextInt();
		//day is greater but same month and year
		if(aDay > eDay && aMonth == eMonth && aYear == eYear){
			System.out.println(Math.abs(15*(aDay - eDay)));
		}
		else if(aYear < eYear){
			System.out.println();
		}
		//same year different month and/or day
		else if(aDay!=eDay||aDay==eDay||aMonth!=eMonth||aMonth==eMonth&&aYear==eYear){
			System.out.println(Math.abs(500*(aMonth - eMonth)));
		}
		//year is greater
		else if(aYear > eYear){
			System.out.println(10000);
		}
		else{
			System.out.println();
		}
	}
}