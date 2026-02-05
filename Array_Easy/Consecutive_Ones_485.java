/*Max Consecutive Ones
Given a binary array nums, return the maximum number of consecutive 1's in the array.
*/

public class Consecutive_Ones_485 {
    public static void main(String[] args) {
        int a[] = {1,1,0,0,1,1,1,0,1,1};
        int max_cons_ones = Cons_ones(a);
        System.out.println("Max consecutive ones in array is: " + max_cons_ones);
    }

    static int Cons_ones(int arr[]) {
        int maxi=0, cnt=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==1) {
                cnt++;
                maxi = Math.max(cnt,maxi);
            } else {
                cnt=0;
            }
        }
        return maxi;
    }
}
