public class Max_Subarray_sum {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = subarray_sum(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
    static int subarray_sum(int arr[]) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum+=arr[i];
            maxi = Math.max(sum,maxi);
            if(sum<0) sum = 0;
        }
        return maxi;
    }
}
