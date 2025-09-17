package Recursion;

public class Sum {
    static int summation(int i, int sum1) {
        if(i==0) return sum1;
        return summation(i-1, sum1+i);  
    }
    public static void main(String[] args) {
        int sum = summation(3, 0);
        System.out.println(sum);
    }
}
