package Array_Hard;
import java.util.*;

class CountSubarraySum_Solution {
    public int count_subarray_sum(int[] arr, int k) {
        int xr = 0;
        int cnt = 0;
        int n = arr.length;
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0,1);
        for(int i = 0; i < n; i++) {
            xr ^= xr^arr[i];
            int x = xr^k;
            if(freq.containsKey(x)) {
                cnt = freq.get(x);
            }
            freq.put(xr, freq.getOrDefault(xr,0)+1);
        }
    return cnt;
    }
}
public class CountSubarraySumXOR {
    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 6, 4};
        CountSubarraySum_Solution obj = new CountSubarraySum_Solution();
        int count = obj.count_subarray_sum(arr,6);
        System.out.println("Count of the subarray XOR sum is " + count);
    }
}
