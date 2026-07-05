package Array_Hard;
import java.util.*;
class ThreeSum {
    // Brute Force Approach

    // Better Approach
    public List<List<Integer>> threeSum_brute(int[] arr) {
        int n = arr.length;
        List<List<Integer>> ls = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for(int j=i+1; j<n; j++) {
                int third = -(arr[i] + arr[j]);
                if(hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
                    Collections.sort(temp);
                    ls.add(temp);                    
                }
                hashset.add(arr[j]);
            }
        }
        return ls; 
        
    }
    // Optimal Approach
    public List<List<Integer>> threeSum_optimal(int[] arr) {
        int n = arr.length;
        List<List<Integer>> st = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i<n; i++) {
            if(i>0 && arr[i] == arr[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k) {
                if(arr[i]+arr[j]+arr[k] < 0) j++;
                else if(arr[i]+arr[j]+arr[k] > 0) k--;
                else{
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                    st.add(temp);
                    j++;
                    k--;
                }
            }
        }
        return st;


    }
    
}
public class Three_Sum_15{
    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = ts.threeSum_optimal(nums);

        System.out.println(result);
    }
}
