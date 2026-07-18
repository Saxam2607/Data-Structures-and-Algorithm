package Binary_Search;

public class LowerBound {
    public static int lower_bound_index(int[] arr, int target) {
        int n = arr.length;
        int ind = n;
        int low = 0;
        int high = n-1;
        int mid;
        while(low <= high) {
            mid = low + (high-low)/2;
            if(arr[mid] >= target) {
                ind = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            } 
        }
        return ind;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8, 9};
        int target = 4;
        int lb = lower_bound_index(arr, target);
        System.out.println(lb);

    } 
}
