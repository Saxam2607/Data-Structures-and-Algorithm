package Sorting;
import java.util.*;

public class Quick_sort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4,6,2,5,7,9,1,3));
        quick_sort(arr, 0, arr.size()-1);
        System.out.println(arr);

    }
    static void quick_sort(ArrayList<Integer> arr, int low, int high) {
        if(low < high) {
            int pIndex = partition(arr, low, high);
            quick_sort(arr, low, pIndex-1);
            quick_sort(arr, pIndex+1, high);
        }
    }
    static int partition(ArrayList<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while(i<j) {
            while(arr.get(i) <= pivot && i < high) i++;

            while(arr.get(j) > pivot && j > low) j--;

            if(i<j) Collections.swap(arr, i, j);
        }
        Collections.swap(arr, low, j);
        return j;
    }
}
