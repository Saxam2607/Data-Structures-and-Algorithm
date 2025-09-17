public class GetSingleNumber_XOR {
    public static void main(String[] args) {
        int a[] = {4,1,2,1,2};
        System.out.println("Key appeared only once: " + exor(a));
    }
    static int exor(int arr[]) {
        int xor = 0;
        for(int i=0; i<arr.length; i++) {
            xor = xor^arr[i];
        }
        return xor;
    }
}
