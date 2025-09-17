package Striver;
import java.util.Scanner;
public class Reverse_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no. to get reversed:");
        int num = in.nextInt();
        int rev = reverse(num);
        System.out.print("Reversed no.: " + rev);
    }
    static int reverse(int n) {
        int temp;
        long rev = 0;
        while(n != 0) {
            temp = n%10;
            rev = rev*10 + temp;
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) 
            return 0;
            n = n/10;
        }
        if(n < 0) {
            return (int) (-1*rev);
        }
        return (int) rev;
    }
}
