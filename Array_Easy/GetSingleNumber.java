import java.util.*;

public class GetSingleNumber {
    public static void main(String[] args) {
        int a[] = {4,1,2,1,2};
        System.out.println("Key appeared only once: " + singleNumber(a));

    }
    static int singleNumber(int arr[]) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            int value = mpp.getOrDefault(arr[i],0);
            mpp.put(arr[i], value+1);
        }
        for(Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if(it.getValue() == 1) {
                return it.getKey();
            }
        }
        return -1;
    }
}
