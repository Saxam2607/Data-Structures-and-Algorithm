package Array_Hard;

class MaximumProductSubarraySolution {
    public static int max_product_brute(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++) {
            int product = arr[i];
            for(int j=i+1; j<n; j++) {
                product = product*arr[j];
                max = Math.max(product, max);
            }
        }
        return max;
    }
    public static int max_product_optimal(int[] arr) {
        int max = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        int n = arr.length;
        for(int i=0; i<n; i++) {
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix = prefix * arr[i];
            suffix = suffix * arr[n-i-1];
            max = Math.max(max, Math.max(prefix, suffix));
        }

        return max;
    }
}

public class MaximumProductSubarray152 {
    public static void main(String[] args) {
        int arr[] = {2, 0, 4, 0, -1, 6, -2, 1};
        int prod = MaximumProductSubarraySolution.max_product_optimal(arr);

        System.out.println(prod);

    }
    
}
