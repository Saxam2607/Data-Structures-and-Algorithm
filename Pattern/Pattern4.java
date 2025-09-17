package Striver;
import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no.: ");
        int n = in.nextInt();
        Star(n);
    }

    static void Star(int n) {
        for(int i = 1; i <= n/2+1; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for(int j = 0; j < n-2*i+1; j++) {
                System.out.print(" ");
            }
            for(int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
