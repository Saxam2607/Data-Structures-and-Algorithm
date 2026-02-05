/*Rotate Array
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */
public class Right_rotate_189 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        RightRotate(a,1);
        for(int i=0; i<7; i++) {
            System.out.print(a[i]+" ");
        }
    }

    static void RightRotate(int arr[], int d) {
        int n = arr.length;
        d=d%n;
        int temp[] = new int[d];

        for(int i=n-d; i<n; i++) {
            temp[i-(n-d)] = arr[i];
        }
        for(int i=n-1; i>=d; i--) {
            arr[i] = arr[i-d];
        }
        for(int i=0; i<d; i++) {
            arr[i] = temp[i];
        }
    }
}
