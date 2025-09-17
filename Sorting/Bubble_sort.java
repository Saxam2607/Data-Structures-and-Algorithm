package Striver;

public class Bubble_sort {
    public static void main(String[] args) {
        int a[] = {3,1,66,32,71,12,30,4,55,100};
        bubble(a,10);
    
        for(int i = 0; i < 10; i++) {
            System.out.print(a[i] +" ");
        }
    }
    
    static void bubble(int arr[], int n) {
         
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
