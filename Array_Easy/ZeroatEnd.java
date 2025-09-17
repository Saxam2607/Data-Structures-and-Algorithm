package Striver;

public class ZeroatEnd {
    public static void main(String[] args) {
        int a[]={1,2};
        Zero(a);
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    static void Zero(int arr[]) {
        int j = 0;
        int n = arr.length;
        if(n==1) {
            return;
        }
        for(int i=0; i<n; i++) {
            if(arr[i] == 0) {
                j=i;
                break;
            }
        }
        for(int i=j+1; i<n; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        } 
    }
}
