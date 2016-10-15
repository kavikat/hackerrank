import java.util.*;

public class reverse{
	public static void main (String[] args){
		String input = "Hi How Are You";
		reverse(input);
	}

	public static void reverse(String in){
		String[] sentence = in.split(" ");
		int length = sentence.length;
			while(length> 0){
				System.out.print(sentence[length-1]+" ");
					length--;
				}
			System.out.println();
	}
}