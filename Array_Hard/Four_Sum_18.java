package Array_Hard;
import java.util.*;

class FourSumSolution {
    public List<List<Integer>> foursum(int[] arr, int target) {
        List<List<Integer>> ls = new ArrayList<>();
        int n = arr.length;
        for(int i =0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                HashSet<Integer> st = new HashSet<>();
                for(int k = j+1; k<n; k++) {
                    int sum = arr[i] + arr[j];
                    sum+=arr[k];
                    int fourth = target - sum;
                    if(st.contains(fourth)) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], fourth);
                        Collections.sort(temp);
                        ls.add(temp);
                    }
                    st.add(arr[k]);
                }
            }
        }
        return ls;

    }
    public List<List<Integer>> FourSumOptimal(int[] arr, int target) {
        List<List<Integer>> ls = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        
        for(int i = 0; i<n; i++) {
            if(i>0 && arr[i] == arr[i-1]) continue;
            for(int j = i+1; j<n; j++) {
                if(j>i+1 && arr[j] == arr[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while(k<l) {
                    long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
                    if(sum==target) {
                        ls.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
                        
                        while(k<l && arr[j]==arr[j+1]) k++;
                        while(k<l && arr[k]==arr[k-1]) l--;
                        k++;
                        l--;
                    }
                    else if(sum<target) k++;
                    else l--;
                    
                }
            }
        }


        return ls;
    }
}



public class Four_Sum_18 {
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        FourSumSolution obj = new FourSumSolution();
        List<List<Integer>> ls = obj.FourSumOptimal(arr, target);
        System.out.println(ls);
    }
}
