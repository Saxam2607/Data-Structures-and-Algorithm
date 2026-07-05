package Array_Hard;
import java.util.*;

public class LargestSubArraySum0 {
    public static int SubarraySum0(int[] arr) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            sum+=arr[i];
            if(sum == 0) {
                maxi = i+1;
            }
            else {
                if(map.containsKey(sum)) {
                    maxi = Math.max(maxi, i - map.get(sum));
                }
                else {
                    map.put(sum, i);
                }
            }
            
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {1,-1,3,2,-2,-8,1,7,10,23};
        int size = SubarraySum0(arr);
        System.out.println(size);

    }
}
