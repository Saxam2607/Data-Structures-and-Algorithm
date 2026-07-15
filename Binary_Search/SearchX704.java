package Binary_Search;

public class SearchX704 {
    public static int BinarySearchIterative(int[] arr, int target) {

        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid;
        while(low <= high) {
            mid = low + (high-low)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
    public static int BinarySearchRecursive(int arr[],int low, int high, int target) {
        int mid;
        while(low <= high) {
            mid = low + (high-low)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) return BinarySearchRecursive(arr, low, mid-1, target);
            else return BinarySearchRecursive(arr, mid+1, high, target);
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,8,9};
        int target = 8;
        int index1 = BinarySearchIterative(arr, target);
        int index2 = BinarySearchRecursive(arr, 0, 6, target);
        System.out.println(index1 + " " + index2);
    }
}
