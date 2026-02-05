package Basic_Maths;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        System.out.println("Is it a Palindrome: " + isPalindrome(num));
    }
    static boolean isPalindrome(int n) {
        if(n<0) 
        return false;
        
        int m = n;
        int temp;
        int rev = 0;
        while(m!=0) {
            temp = m % 10;
            m = m/10;
            rev = 10*rev + temp;
        }
        return(rev == n);
    }
    
}
