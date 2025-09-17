package Array_Hard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority_Elements_N3 {
    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = major_moore(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
    static List<Integer> major_moore(int arr[]) {
        List<Integer> major = new ArrayList<>();
        int n = arr.length;
        int min = (int)n/3 + 1;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0; i<n; i++) {
            if(cnt1==0 && el2!=arr[i]) {
                cnt1 = 1;
                el1 = arr[i];
            }
            else if(cnt2==0 && el1!=arr[i]) {
                cnt2 = 1;
                el2 = arr[i];
            }
            else if(el1 == arr[i]) cnt1++;
            else if(el2 == arr[i]) cnt2++;
            else {
                cnt1--; 
                cnt2--;
            }
        }

        cnt1=0; cnt2=0;
        for(int i=0; i<n; i++) {
            if(el1==arr[i]) cnt1++;
            if(el2==arr[i]) cnt2++;
        }
        if(cnt1>=min) major.add(el1);
        if(cnt2>=min) major.add(el2);
        return major;
    }

    static ArrayList<Integer> major_hash(int arr[]) {
        int n = arr.length;
        int min = (int)n/3+1;
        ArrayList<Integer> major = new ArrayList<>();
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0; i<n; i++) {
            int value = mpp.getOrDefault(arr[i],0);
            mpp.put(arr[i], value+1);

            if(mpp.get(arr[i])==min) {
                major.add(arr[i]);
            }
            if(major.size()==2) break;
        }
        return major;
    }
}
