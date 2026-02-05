package Sorting;
import java.util.*;

public class Merge_sort {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(13,46,24,52,20,9));
        MergeSort(a, 0,a.size()-1);
        System.out.println(a);
    }
    static void MergeSort(ArrayList<Integer> arr, int low, int high) {
        if(low >= high) return;

        int mid = low + (high-low)/2;
        MergeSort(arr, low, mid);
        MergeSort(arr, mid+1, high);
        Merge(arr, low, high, mid);
        
    }
    static void Merge(ArrayList<Integer> arr, int low, int high, int mid) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();

        while(left <= mid && right <= high) {
            if(arr.get(left) <= arr.get(right)){
                temp.add(arr.get(left));
                left++;
            }
            else{
                temp.add(arr.get(right));
                right++;
            }
        }
        while(left<=mid) {
            temp.add(arr.get(left));
            left++;
        }
        while(right<=high) {
            temp.add(arr.get(right));
            right++;
        }
        for(int i = low; i<=high; i++) {
            arr.set(i, temp.get(i-low));
        }

    }

}
