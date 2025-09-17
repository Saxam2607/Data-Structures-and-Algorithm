package Striver;

public class Pattern5 {
    public static void main(String[] args) {

    }
    
    static void Star(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n/2-i; j++) {
                System.out.println("*");
            }
            int breakthrough = n/2;
            for(int j = 0; j < 2*i + 1; j++) {
                if(breakthrough > i) System.out.println();
            }
        }
    }
}
