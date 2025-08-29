import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=sc.nextInt();
        int GCD=findGCD(n,v);
        System.out.println("GCD of two number is "+GCD);
    }
    public static int findGCD (int n,int v)
    {
        while(v!=0)
        {
            int temp=v;
            v=n%v;
            n=temp;
        }
        return n;
    }
}
