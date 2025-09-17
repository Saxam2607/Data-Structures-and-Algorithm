package Array_Hard;
import java.util.ArrayList;
public class Pascal_triangle {
    public static void main(String[] args) {
        int n = 6;
        ArrayList<ArrayList<Integer>> ans = pascal(n);
        for(ArrayList<Integer> it : ans) {
            for(int el : it) {
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
    static ArrayList<Integer> generateRow(int row) {
        long ans = 1;
        ArrayList<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int i=1; i<row; i++) {
            ans = ans*(row-i);
            ans = ans/(i);
            ansRow.add((int)ans);
        }
        return ansRow;
    }
    static ArrayList<ArrayList<Integer>> pascal(int n) {
        ArrayList<ArrayList<Integer>> ansTri = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            ansTri.add(generateRow(i));
        }
        return ansTri;
    }
}
