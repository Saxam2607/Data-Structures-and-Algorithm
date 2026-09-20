package Binary_Search;

public class SingleElementInSortedArray540 {
    public static int single_element(int[] arr) {
        int n = arr.length;
        if(n == 0) return -1;
        int low = 0;
        int high = n-1;

        while(low < high) {
            int mid = low + (high-low)/2;
            if(arr[mid] == arr[mid ^ 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,4,5,5};
        int element = single_element(arr);
        System.out.println(element);
    }
}
