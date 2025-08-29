import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int u=0;
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)       
              {
            char c =str.charAt(i);
            if(c>=65 && c<=90)
                u++;
        }
        System.out.println(u);
    }
}
