import java.util.*;

public class diagDiff{
	public static void main (String [] args){
		//take input
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum1=0, sum2=0;
		int[][] matrix = new int[n][n];
		//set array variables
		int center = findCenter(n), end = matrix.length - 1;
		//populate n1
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
			matrix[i][j] = sc.nextInt();
			}
		}
		//add sums of diagonal arrays
		for(int i = 0, j = n - 1; i < n; ++i, j --)
		 {
		    sum1 += matrix[i][i];
		    sum2 += matrix[i][j];
		  }
		
		if(sum1 > sum2){
			int diff = sum1 - sum2;
			System.out.println(diff);
		}
		else{
			int diff = sum2 - sum1;
			System.out.println(diff);
		}	
	}//main
/*finds centter of array*/
		public static int findCenter(int n){
		int center=0;
		if(n%2!=0){
			center = ((n+1)/2) -1;
		}
		else{
			center = (n/2)-1;
		}
		return center;
		}//fc
}//dd