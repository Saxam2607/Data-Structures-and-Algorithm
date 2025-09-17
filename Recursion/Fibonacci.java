package Recursion;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();
        System.out.println("Fibbonaci series: " + Fibo(num));
    }

    static int Fibo(int n) {
        if(n == 1)
        return 1;

        return n + Fibo(n-1);
    }
}
