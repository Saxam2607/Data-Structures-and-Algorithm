package Recursion;
import java.util.*;

public class String_Palindrome {

    static boolean s_palindrome(int i, String s) {
        int n = s.length();
        if(i>=n/2) return true;
        if(s.charAt(i) != s.charAt(n-i-1)) return false;
        return s_palindrome(i+1, s);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = in.nextLine();
        System.out.println("is it a string palindrome: "+ s_palindrome(0,s));
        in.close();

    }
}
