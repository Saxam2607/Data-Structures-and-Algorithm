import java.util.HashMap;
import java.util.Map;

public class Count_Subarray_Sum {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = countSubarraySum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);

    }
    static int countSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        int preSum = 0;
        Map<Integer, Integer> preSumMap = new HashMap<>();
        preSumMap.put(0, 1);
        for(int i = 0; i < n; i++) {
            preSum += arr[i];

            int rem = preSum - k;
            if(preSumMap.containsKey(rem)) count++;
            preSumMap.put(preSum, preSumMap.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}
