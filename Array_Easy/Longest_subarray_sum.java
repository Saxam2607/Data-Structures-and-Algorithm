import java.util.HashMap;
import java.util.Map;

public class Longest_subarray_sum {
    public static void main(String[] args) {
        int[] a = { -1, 1, 1};
        int k = 1;
        int len = LongestSubarraySum(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
    static int LongestSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int maxlen = 0;
        long sum = 0;
        Map<Long, Integer> preSumMap = new HashMap<>();
        for(int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum == k) {
                maxlen = Math.max(maxlen, i+1);
            }
            long rem = sum - k;
            if(preSumMap.containsKey(rem)) {
                maxlen = Math.max(i-preSumMap.get(rem), maxlen);
            }
            if(!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxlen;
    }
}    