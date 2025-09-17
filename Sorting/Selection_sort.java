package Striver;

public class Selection_sort {
    public static void main(String[] args) {
        int a[] = {3,1,66,32,71,12,30,4,55,100};
        selection(a,10);
    
        for(int i = 0; i < 10; i++) {
            System.out.print(a[i] +" ");
        }
    }

    static void selection(int arr[],int n) {

        for(int i = 0; i <= n-1; i++) {
            for(int j = i; j < n-1; j++) {
                if(arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}

