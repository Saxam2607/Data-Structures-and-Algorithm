public class Second_largest {
    public static void main(String[] args) {
        int a[] = {9,1,6,3,9,8,2,4,5,7};
        int largest = largest(a, 10);
        int sec_largest = secondlargest(a, 10);
        System.out.println(largest + " is the largest no. in the array");
        System.out.println(sec_largest + " is the second largest no. in the array");

    }

    static int largest(int arr[], int n) {
        int largest = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    static int secondlargest(int arr[], int n) {
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }

        return slargest;
    }
}
