package Binary_Search;

public class MinInSortedArray153 {
    public static int min_in_array(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int min = Integer.MAX_VALUE;
        while(low <= high) {
            if(arr[low] <= arr[high]) {
                min = Math.min(min, arr[low]);
                break;

            }
            int mid = low + (high - low)/2;
            //left sorted
            if(arr[low] <= arr[mid]) {
                min = Math.min(min, arr[low]);
                low = mid+1;
            }
            //right sorted
            else {
                min = Math.min(min, arr[mid]);
                high = mid-1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {7,8,9,1,2,3,4,5,6};
        int minimum = min_in_array(arr);
        System.out.println(minimum);
    }
}
