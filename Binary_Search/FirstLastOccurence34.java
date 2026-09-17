package Binary_Search;
import java.util.Arrays;

public class FirstLastOccurence34 {
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
    public static int upper_bound_index(int[] arr, int target) {
        int n = arr.length;
        int ind = n;
        int low = 0;
        int high = n-1;
        int mid;
        while(low <= high) {
            mid = low + (high-low)/2;
            if(arr[mid] > target) {
                ind = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ind;
    }
    public static int[] pair_of_occurence(int[]arr, int target) {
        int n = arr.length;
        int lb = lower_bound_index(arr, target);
        int ub = upper_bound_index(arr, target);

        if(lb == n || arr[lb] != target) {
            return new int[]{-1,-1};
        }
        return new int[]{lb, ub-1};
    }
    public static int first_occur_bs(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int first = -1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] == target) {
                first = mid;
                high = mid-1;
            }
            else if(arr[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return first;
    }
    public static int last_occur_bs(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int last = -1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] == target) {
                last = mid;
                low = mid+1;
            }
            else if(arr[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return last;
    }

    public static int[] pair_of_occurence2(int arr[], int target) {
        int first = first_occur_bs(arr, target);
        if(first == -1) {
            return new int[]{-1, -1};
        }
        int last = last_occur_bs(arr, target);
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 4, 4, 5, 6, 9};
        int[] first_last_index = pair_of_occurence(arr, 4);
        int[] first_last_index2 = pair_of_occurence2(arr, 4);
        System.out.println(Arrays.toString(first_last_index));
        System.out.println(Arrays.toString(first_last_index2));
    }
}
