public class MajorityElement_Moore {
    public static void main(String[] args) {
        int a[] ={3,2,3};
        System.out.println(moore(a));
    }
    static int moore(int arr[]) {
        int el=arr[0];
        int cnt = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(el==arr[i]) cnt++;

            else cnt--;

            if(cnt==0) {
                el = arr[i+1];
            }
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == el) count++;
        }
        if(count>(arr.length/2)) return el;
        return -1;

    }
}
