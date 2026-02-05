package Sorting;

public class Bubble_sort {
    public static void main(String[] args) {
        int a[] = {13,46,24,52,20,9};
        bubble(a);
    
        for(int num : a) {
            System.out.print(num +" ");
        }
    }
    
    static void bubble(int arr[]) {
        int n = arr.length;
        for(int i = n; i > 0; i--) {
            int didSwap = 0;
            for(int j = 0; j < i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0) break;
            System.out.println("Runs");
        }
    }
}
