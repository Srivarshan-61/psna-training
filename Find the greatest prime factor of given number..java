import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
        int n=sc.nextInt(),p=2;
        while(n>1){
            while(n%p==0) n/=p;
            if(n>1)
                p++;
        }
        System.out.println(p);
    }
}
