package Array_Hard;
import java.util.*;

class MergeOverlappingSubarray56Solution {
    public List<List<Integer>> Merge_Overlapping_Subarray_Brute(int[][] interval) {
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(interval, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });
        int n = interval.length;
        int i = 0;
        while(i < n) {
            int start = interval[i][0];
            int end = interval[i][1];

            int j = i+1;

            while(j<n && interval[j][0] < end) {
                end = Math.max(end, interval[j][1]);
                j++;
            }
            ls.add(Arrays.asList(start, end));

            i=j;
        }
        return ls;
    }

    public List<List<Integer>> Merge_Optimal(int[][] interval) {
        List<List<Integer>> ls = new ArrayList<>();
        int n = interval.length;
        Arrays.sort(interval, (a,b) -> {
            if(a[0]!=b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });


        for(int i = 0; i < n; i++) {
            if(ls.isEmpty() || ls.get(ls.size()-1).get(1) < interval[i][0]) {
                ls.add(Arrays.asList(interval[i][0], interval[i][1]));
            }
            else {
                int maxEnd = Math.max(ls.get(ls.size()-1).get(1), interval[i][1]);
                ls.get(ls.size()-1).set(1,maxEnd);
            }
        }

        return ls;
    }

}

public class MergeOverlappingSubarray56 {
    public static void main(String[] args) {
        int arr[][] = {{1,3},{2,6},{8,11},{7,12},{2,4}};
        MergeOverlappingSubarray56Solution obj = new MergeOverlappingSubarray56Solution();
        MergeOverlappingSubarray56Solution obj2 = new MergeOverlappingSubarray56Solution();

        List<List<Integer>> ls = obj.Merge_Overlapping_Subarray_Brute(arr);
        System.out.println(ls);
        int arr2[][] = {{1,3},{2,6},{8,11},{7,12},{2,4}};
        List<List<Integer>> ls2 = obj2.Merge_Optimal(arr2);
        System.out.println(ls2);



    }
}