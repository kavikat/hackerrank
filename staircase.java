import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class staircase{

    public static void main(String[] args) {
        int height,width;
        Scanner reader = new Scanner(System.in);
        height = reader.nextInt();
        //input validation
        if(height > 0){
            //set width equal to height
            //print width first
            for(int i=1;i<height;i++){
            System.out.println('#');
            //formatting
            //increment width with i
                width = i;
                //print width coresponding to height
                for (int j =0;j<width;j++){
                    System.out.print('#');
                }
            }
        }
        
    }
}