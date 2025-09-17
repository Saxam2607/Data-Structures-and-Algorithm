package Recursion;
import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int n = in.nextInt();
        System.out.print("Sum from 1 to " + n +" = "+ rec_sum(n));
    }
    static int rec_sum(int n) {
        if(n == 0) {
            return n;
        }
        return n + rec_sum(n-1);
    }
}
