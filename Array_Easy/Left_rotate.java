/*189. Left Rotate Array by k places */

public class Left_rotate {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        int b[] = {1,2,3,4,5,6,7};
        LeftRotate(a,3,7);
        System.out.println("brute approach:");
        for(int i=0; i<7; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("\noptimal approach:");
        left_rotate_optimal(b, 3);
        for(int i=0; i<b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
    //Brute approach
    static void LeftRotate(int arr[], int d, int n) {
        d=d%n;
        int temp[] = new int[d];

        for(int i=0; i<d; i++) {
            temp[i] = arr[i];
        }
        for(int i=d; i<n; i++) {
            arr[i-d] = arr[i];
        }
        for(int i=n-d; i<n; i++) {
            arr[i] = temp[i-(n-d)];
        }
    }
    //Optimal approach
    static void left_rotate_optimal(int arr[], int d) {
        int n = arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, n-d-1, n-1);
        reverse(arr, 0, n-1);

    }
    static void reverse(int arr[], int start, int end) {

        while(start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
