import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int a[] ={2,2,1,1,1,2,2};
        System.out.println(major_element(a));

    }
    static int major_element(int arr[]) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i],value+1);
        }
        for(Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if(it.getValue() > arr.length/2) {
                return it.getKey();
            }
        }
        return -1;
    } 
} 