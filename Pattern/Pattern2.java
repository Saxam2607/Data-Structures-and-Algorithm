package Striver;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of rows for stars: ");
        int n = in.nextInt();
        for(int i = n; i >= 0; i--) {
            for(int j = 0; j <= n-i-1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for(int j = 0; j <= n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
