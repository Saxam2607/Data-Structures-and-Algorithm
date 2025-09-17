public class Set_matrix_zero {
    public static void main(String[] args) {
        int mat[][] = {{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,1,1,1}};
        int ans[][] = zero_matrix(mat, 4, 4);
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }
    static int[][] zero_matrix(int[][] matrix, int n, int m) {
        //int col[m] -> matrix[0][..]
        //int row[n] -> matrix[..][0]
        int col0 = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == 0) {
                    // mark row
                    matrix[i][0] = 0;
                    // mark col
                    if(j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }
        for(int i=1; i<n; i++) {
            for(int j=1; j<m; j++) {
                if(matrix[i][j] != 0) {
                    if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }                    
                }
            }
        }
        if(col0 == 0) {
            for(int i=0; i<n; i++) {
                matrix[i][0] = 0;
            }
        }
        if(matrix[0][0] == 0) {
            for(int j=1; j<m; j++) {
                matrix[0][j] = 0;
            }
        }
        return matrix;
    }
}
