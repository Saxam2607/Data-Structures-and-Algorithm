package Sorting;

public class Selection_sort {
    public static void main(String[] args) {
        int a[] = {13,46,24,52,20,9};
        selection(a);
    
        for(int num : a) {
            System.out.print(num +" ");
        }
    }

    static void selection(int arr[]) {

        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int minIndex = i;
            for(int j = i; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

