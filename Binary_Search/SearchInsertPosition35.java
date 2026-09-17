package Binary_Search;

public class SearchInsertPosition35 {
    public static int insert_position(int[] arr, int target) {
        int n = arr.length;
        int ans = n;
        int low = 0;
        int high = n-1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] >= target) {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8, 9};
        int target = 4;
        int ins = insert_position(arr, target);
        System.out.println(ins);

    }
}
