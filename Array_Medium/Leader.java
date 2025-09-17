import java.util.ArrayList;

public class Leader {
    public static void main(String[] args) {
        int arr[] = {2,-1,7,6};
        ArrayList<Integer> ans = leader(arr);
        for(int i = 0; i<ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }

    }
    static ArrayList<Integer> leader(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int maxi = arr[n-1];
        ans.add(maxi);
        for(int i = n-2; i>0; i--) {
            if(arr[i] > maxi) {
                maxi = arr[i];
                ans.add(maxi);
            }
        }
        return ans;
    }
}
