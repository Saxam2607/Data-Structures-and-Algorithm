package Binary_Search;

public class TimesArrayRotated {
    public static int times_array_rotated(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int index = 0;

        while(low <= high) {
            if(arr[low] <= arr[high]) {
                if(arr[low] < arr[index]) {
                    index = low;
                }
                break;
            }
            int mid = low + (high-low)/2;
            //left sorted
            if(arr[low] <= arr[mid]) {
                if(arr[low] < arr[index]) {
                    index = low;
                }
                low = mid+1;
            }
            else {
                if(arr[mid] < arr[index]) {
                    index = mid;
                }
                high = mid-1;
            }

        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int times_rotated = times_array_rotated(arr);
        System.out.println(times_rotated);
    }
}