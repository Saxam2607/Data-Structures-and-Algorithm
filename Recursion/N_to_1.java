package Recursion;
import java.util.Scanner;
public class N_to_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = in.nextInt();
        int n = in.nextInt();

        printNto1(num);
        print1toN(1, n);
    }
    static void printNto1(int num){
        if(num<1) {
            return;
        }
        System.out.println(num);
        printNto1(num-1);
    }
    static void print1toN(int i, int num) {
        if(i>num) {
            return;
        }
        System.out.println(i);
        print1toN(i+1, num);
    }
}
