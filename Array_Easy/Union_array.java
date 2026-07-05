import java.util.*;

public class Union_array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5};
        List<Integer> list = union(arr1, arr2);
        System.out.println(list);
        List<Integer> list2 = union2(arr1, arr2);
        System.out.println(list2);

    }
    // Using TreeMap
    static List<Integer> union(int arr1[], int arr2[]) {
        List<Integer> union = new ArrayList<>();
        Map<Integer, Integer> freq = new TreeMap<>();
        int n1= arr1.length;
        int n2= arr2.length;

        for(int i=0; i<n1; i++) {
            freq.put(arr1[i], freq.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0; i<n2; i++) {
            freq.put(arr2[i], freq.getOrDefault(arr2[i],0)+1);
        }
        for(int x:freq.keySet()) {
            union.add(x);
        }
        return union;
    }
    // Using TreeSet
    static List<Integer> union2(int arr1[], int arr2[]) {
        List<Integer> union = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();

        for(int x:arr1) {
            set.add(x);
        }
        for(int x:arr2) {
            set.add(x);
        }
        for(int x:set) {
            union.add(x);
        }
        return union;
    }
}
