public class Rearrange_sign {
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        int ans[]=rearrange(arr);
        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    static int[] rearrange(int arr[]) {
        int n = arr.length;
        int pos_Index = 0;
        int neg_Index = 1;
        int a[] = new int[n];
        for(int i=0; i<n; i++) {
            if(arr[i] < 0) {
                a[neg_Index] = arr[i];
                neg_Index+=2;
            } else {
                a[pos_Index] = arr[i];
                pos_Index +=2;
            }
        }
        return a;

    }
}
