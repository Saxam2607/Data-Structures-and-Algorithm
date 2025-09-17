package Recursion;

public class Name {

    static void name_call(int i, int n) {
        if(i==n) return;
        System.out.println("Saksham Chaturvedi");
        name_call(i+1,n);

    }
    public static void main(String[] args) {
        name_call(0, 5);

    }
}
