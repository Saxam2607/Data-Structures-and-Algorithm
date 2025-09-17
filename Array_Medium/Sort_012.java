public class Sort_012 {
    public static void main(String[] args) {
        int arr[] ={2,0,2,1,1,0};
        sort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void sort(int a[]) {
        int low, mid, high, temp;
        low=mid=0;
        high=a.length-1;
        while(mid<=high) {
            if(a[mid]==0) {
                temp = a[mid];
                a[mid] = a[low];
                a[low] = temp;
                mid++;
                low++;
            } else if(a[mid]==1) mid++;
            else {
                temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
    }
}
