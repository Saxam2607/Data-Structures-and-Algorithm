package Binary_Search;

public class FloorCeil {
    public static int floor(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] <= x) {
                ans = arr[mid];
                low = mid+1;
            }
            else high = mid-1;
        }

        return ans;
    }
    public static int ceil(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] >= x) {
                ans = arr[mid];
                high = mid-1;
            }
            else low = mid+1;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8, 9};
        int target = 4;
        int floor = floor(arr, target);
        int ceil = ceil(arr, target);
        System.out.println(floor);
        System.out.println(ceil);


    } 
}
