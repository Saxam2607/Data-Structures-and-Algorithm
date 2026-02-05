/*Missing Number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*/

import java.util.Scanner;

public class MissingNumber_Sum_268 {
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
        int n = arr.length;
        int sum = (n*(n+1))/2;

        int s2=0;
        for(int i=0; i<n; i++) {
            s2 += arr[i];
        }
        return sum-s2;
        }
}
