public class Linear_Search {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int item = 7;
        int loc = LinearSearch(a,item);
        System.out.println(loc);
    }

    static int LinearSearch(int arr[], int item) {
        for(int i=0; i<arr.length; i++) {
            if(item == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
