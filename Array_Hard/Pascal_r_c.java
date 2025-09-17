package Array_Hard;
import java.util.Scanner;

public class Pascal_r_c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        System.out.println("Element at given row and col is: " + combination(row, col));

    }
    static int ans(int r, int c) {
        int res = 1;
        if(r-c < c) c = r-c;
        for(int i = 1; i <= c; i++) {
            res *= (r-i+1);
            res /= i;
        }
        return res;
    }
    static int combination(int r, int c) {
        return ans(r-1, c-1);
    }
    
}
