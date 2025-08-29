import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  
        String input = sc.nextLine();
        int length = input.length();
        n = n % length;
        String rotated = input.substring(n) + input.substring(0, n);
        System.out.println(rotated);
        sc.close();
    }
}
