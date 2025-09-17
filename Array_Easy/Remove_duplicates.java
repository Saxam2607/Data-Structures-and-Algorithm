package Striver;

public class Remove_duplicates {
    public static void main(String[] args) {
        int a[] = {1,1,2,2,2,3,3};
        int unique = rem_duplicate(a,7);
        System.out.println(unique);

    }

    static int rem_duplicate(int arr[], int n) {
        int i=0;
        for(int j=1; j<n; j++) {
            if(arr[i] != arr[j]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
