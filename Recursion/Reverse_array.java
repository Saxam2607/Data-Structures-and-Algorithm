package Recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Reverse_array {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Rev_array(arr, 0);
        System.out.println(arr);
    }

    static void Rev_array(ArrayList<Integer> list, int i) {
        int n = list.size();
        if(i==n/2) return;

        Collections.swap(list, i, n-i-1);
        Rev_array(list, i+1);       
    }
}
