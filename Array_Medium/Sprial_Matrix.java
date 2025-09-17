import java.util.ArrayList;

public class Sprial_Matrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        int n = matrix.length*matrix[0].length;
        ArrayList<Integer> ans = spiral(matrix);
        for(int i=0; i<n; i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
    static ArrayList<Integer> spiral(int[][] mat) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        int left = 0, right = m-1;
        int top = 0, bottom = n-1;

        while(top<=bottom && left<=right) {
            for(int i = left; i<=right; i++) {
                arr.add(mat[top][i]);
            }
            top++;
            for(int i = top; i<=bottom; i++) {
                arr.add(mat[i][right]);
            }
            right--;
            if(top<=bottom) {
                for(int i = right; i>=left; i--) {
                    arr.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right) {
                for(int i = bottom; i>=top; i--) {
                    arr.add(mat[i][left]);
                }
                left++;
            }   
        }
        return arr;
    }
}
