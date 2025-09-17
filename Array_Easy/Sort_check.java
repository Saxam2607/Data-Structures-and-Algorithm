package Striver;

public class Sort_check {
    public static void main(String[] args) {
        int a[] = {1,2,5,4,5};
        boolean check = Sort(a, 5);
        System.out.println("Array is sorted: " + check);
    }

    static boolean Sort(int arr[], int n) {
        for(int i=0; i<n-1; i++) {
            if(arr[i] > arr[i+1]) 
                return false;
        }
        return true;
    }
}
