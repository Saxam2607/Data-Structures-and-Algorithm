import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int a[] = {2,6,5,8,11};
        int target = 14;
        int i[] = twosum(a,target);
        System.out.println(i[0]+" "+i[1]);
    }

    static int[] twosum(int arr[], int target) {
        int index[] = new int[2];
        index[0] = index[1] = -1;
        HashMap <Integer, Integer> mpp = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            int num = arr[i];
            int rem = target-num;
            if(mpp.containsKey(rem)) {
                index[0] = mpp.get(rem);
                index[1] = i;
                return index;
            }
            mpp.put(arr[i],i);
        }
        return index;
    }
}
