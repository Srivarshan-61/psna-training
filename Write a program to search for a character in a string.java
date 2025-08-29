import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        char searchChar = sc.nextLine().charAt(0);
        String input = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == searchChar) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }
        sc.close();
    }
}
