/*Remove Duplicates from Sorted Array*/
public class Remove_duplicates_26 {
    public static void main(String[] args) {
        int a[] = {1,1,2,2,2,3,3};
        int unique = rem_duplicate(a);
        System.out.println(unique);

    }

    static int rem_duplicate(int arr[]) {
        int i=0;
        for(int j=1; j<arr.length; j++) {
            if(arr[i] != arr[j]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
