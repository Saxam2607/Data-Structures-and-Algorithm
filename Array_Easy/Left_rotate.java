public class Left_rotate {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        LeftRotate(a,3,7);
        for(int i=0; i<7; i++) {
            System.out.print(a[i]+" ");
        }
    }

    static void LeftRotate(int arr[], int d, int n) {
        d=d%n;
        int temp[] = new int[d];

        for(int i=0; i<d; i++) {
            temp[i] = arr[i];
        }
        for(int i=d; i<n; i++) {
            arr[i-d] = arr[i];
        }
        for(int i=n-d; i<n; i++) {
            arr[i] = temp[i-(n-d)];
        }
    }
}
