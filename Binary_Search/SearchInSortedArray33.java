package Binary_Search;

public class SearchInSortedArray33 {
    public static int search_sorted_array(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] == target) return mid;

            // left sorted
            if(arr[low] <= arr[mid]) {
                if(arr[low] <= target && target <= arr[mid]) {
                    high = mid-1;
                } else {
                    low = mid+1;
                }
            }
            // right sorted
            else {
                if(arr[mid] <= target && target <= arr[high]) {
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        int loc = search_sorted_array(arr, 1);
        System.out.println(loc);
    }
}
