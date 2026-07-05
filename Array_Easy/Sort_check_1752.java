/*1752. Check if Array Is Sorted and Rotated */
public class Sort_check_1752 {
    public static void main(String[] args) {
        int a[] = {3,5,7,4,5};
        boolean check = check(a);
        System.out.println("Array is sorted: " + check);
    }

    static boolean check(int arr[]) {
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++) {
            if(arr[i]>arr[(i+1)%n]) count++;
        }
        return count<=1;
    }


    // static boolean Sort(int arr[]) {
    //     int n = arr.length;
    //     Right_rotate(arr);
    //     for(int i=0; i<n-1; i++) {
    //         if(arr[i] > arr[i+1]) 
    //             return false;
    //     }
    //     return true;
    // }
    // static int rotate(int arr[]) {
    //     int n = arr.length;
    //     int smallest = Integer.MAX_VALUE;
    //     int i = n-1;
    //     while(i>=0) {
    //         if(arr[i]<smallest) {
    //             smallest = arr[i];
    //             i--;
    //         }
    //         else break;
    //     }
    //     return n-i+1;
    // }
    // static void Right_rotate(int arr[]) {
    //     int d = rotate(arr);
    //     int n = arr.length;
    //     int temp[] = new int[d];

    //     for(int i=n-d; i<n; i++) {
    //         temp[i-(n-d)] = arr[i];
    //     }
    //     for(int i=n-1; i>=d; i--) {
    //         arr[i] = arr[i-d];
    //     }
    //     for(int i=0; i<d; i++) {
    //         arr[i] = temp[i];
    //     }
    // }
}
