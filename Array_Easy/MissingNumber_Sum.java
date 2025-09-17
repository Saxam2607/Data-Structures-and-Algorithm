import java.util.Scanner;

public class MissingNumber_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        int missing_no = missed(a);
        System.out.println("Missing no. is: " + missing_no);
    }

    static int missed(int arr[]) {
        int n = arr.length+1;
        int sum = (n*(n+1))/2;

        int s2=0;
        for(int i=0; i<n; i++) {
            s2 += arr[i];
        }
        return sum-s2;
        }
}
