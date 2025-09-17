package Striver;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of stars: ");
        int n = in.nextInt();
        star(n);
    }
    static void star(int n) {
        for(int i = 0; i <= 2*n; i++) {
            int temp = i;
            if(i > n) {
                temp = 2*n - i;
            }
            for(int j = 0; j <= temp; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
