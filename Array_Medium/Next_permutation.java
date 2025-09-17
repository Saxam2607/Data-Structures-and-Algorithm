import java.util.*;
public class Next_permutation {
    static List<Integer> next(List<Integer> arr) {
        int n = arr.size();
        int ind = -1;
        for(int i=n-2; i>=0; i--) {
            if(arr.get(i) < arr.get(i+1)) {
                ind = i;
                break;
            }
        }
        if(ind == -1) {
            Collections.reverse(arr);
            return arr;
        }
        for(int i=n-1; i>ind; i--) {
            if(arr.get(ind)>arr.get(i)) {
                Collections.swap(arr, i, ind);
                break;
            } 
        }
        Collections.reverse(arr.subList(ind+1, n));
        return arr;
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(2,1,5,4,3,0,0));
        List<Integer> ans = next(arr);
        for(int i=0; i<ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }        

    }
}
