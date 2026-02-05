package Recursion;

public class Sum {
    public static void main(String[] args) {
        int sum1 = summation(3, 0);
        int sum2 = sum_functional(5);
        System.out.println(sum1);
        System.out.println(sum2);
    }
    static int summation(int i, int sum1) {
        if(i==0) return sum1;
        return summation(i-1, sum1+i);  
    }
    static int sum_functional(int i) {
        if(i==0) return 0;
        return i + sum_functional(i-1);
    }
}
