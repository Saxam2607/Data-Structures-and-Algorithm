import java.util.Scanner;
public class MissingNumber_Hash {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        int missing_no = missing(a,n);
        System.out.println("Missing no. is: " + missing_no);
    }

    static int missing(int arr[], int n) {
        int hash[] = new int[n+2];
        //precompute
        for(int i=0; i<n; i++) {
            hash[arr[i]]++;
        }
        for(int i=0; i<=n; i++) {
            if(hash[i] == 0) {
                return i;
            }
        }
        return 0;
    }
    
}
