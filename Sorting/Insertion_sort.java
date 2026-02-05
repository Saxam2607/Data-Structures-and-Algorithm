package Sorting;

public class Insertion_sort {
    public static void main(String[] args) {
        int a[] = {3,1,66,32,71,12,30,4,55,100};
        insertion(a,10);
    
        for(int i = 0; i < 10; i++) {
            System.out.print(a[i] +" ");
        }
    }

    static void insertion(int arr[], int n) {

        for(int i = 0; i < n; i++) {
            for(int j = i; j > 0 && arr[j]<arr[j-1]; j--) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
    }
}
