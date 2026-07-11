package Array_Hard;
import java.util.*;


class MissingRepeaingNumberSolution {
    public int[] MissingRepeatingNumber_Math(int[] arr) {
        int k = arr.length;

        long s1n = (k * (k+1)) / 2;
        long s2n = (k*(k+1)*(2*k+1)) / 6;
        long s1 = 0;
        long s2 = 0;
        for(int i = 0; i < k; i++) {
            s1 += arr[i];
            s2 += arr[i] * arr[i];
        }
        long val1 = s1n - s1;
        long val2 = s2n - s2;
        val2 = val2 / val1;

        long missing = (val1 + val2) / 2;
        long repeating = missing - val1;


        return new int[]{(int) missing, (int) repeating};

    }
    public int[] MissingRepeatingNumber_XOR(int[] arr) {
        int n = arr.length;
        // Xoring array elements
        int xr = 0;
        for(int i=0; i<n; i++) {
            xr ^= arr[i];
            xr ^= (i+1);
        }
        // finding which bit no. place is 1
        int bitNo = 0;
        while(true) {
            if((xr & (1<<bitNo)) != 0) {
                break;
            }
            bitNo++;
        }
        // clubbing into 1's and 0's, 1's whose bitNo. is 1 and 0's whose bitNo. is 0
        int one = 0;
        int zero = 0;

        for(int i=0; i<n; i++) {
            if((arr[i] & (1<<bitNo)) != 0) {
                one ^= arr[i];
            }
            else {
                zero ^= arr[i];
            }
        }
        // Divide natural numbers 1 to n into groups and XOR
        for (int i = 1; i <= n; i++) {
            if ((i & (1<<bitNo)) != 0) {
                one ^= i;
            } else {
                zero ^= i;
            }
        }
        //finding which one is missing and which is repeating
        int cnt = 0;
        for(int val:arr) {
            if(val == zero) cnt++; 
        }
        // returning {missing,repeating}
        if(cnt == 2) return new int[]{one, zero};
        return new int[]{zero, one};
    }

}
public class MissingRepeaingNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1};
        MissingRepeaingNumberSolution obj = new MissingRepeaingNumberSolution();
//        int[] miss_repeat = obj.MissingRepeatingNumber_Math(nums);
        int[] miss_repeat2 = obj.MissingRepeatingNumber_XOR(nums);
      
        System.out.println(Arrays.toString(miss_repeat2));
    }
    
}
