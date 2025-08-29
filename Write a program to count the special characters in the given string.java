import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       String input =sc.nextLine();
        int count = 0;
        for(int i=0;i < input.length();i++){
            char ch= input.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
