//https://leetcode.com/problems/transpose-matrix/

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {

        //Time Complexity - O(n^2)
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] res = new int[n][m];

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}
