package Binary_Search;

public class PeakElement162 {
    public static int peak(int[] arr) {
        int n = arr.length;
        if(n==1) return arr[0];
        if(arr[0] > arr[1]) return arr[0];
        if(arr[n-1] > arr[n-2]) return arr[n-1];
        int low = 1;
        int high = n-2;

        while(low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return arr[mid];
            else if(arr[mid] > arr[mid+1]) high = mid-1;
            else if(arr[mid] < arr[mid+1]) low = mid+1;
            else high = mid-1;  // arr[mid] == arr[mid+1], search left
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,5,7,6};
        int peak = peak(arr);
        System.out.println(peak);
    }
    
}
