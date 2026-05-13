//https://leetcode.com/problems/flipping-an-image/

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        //Time Complexity: O(n x n) = O(n^2)
        int n = image.length;
        int m = image[0].length;
        int res[][] = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                //To Invert → change 0 ↔ 1 - use 1 - image[i][j]
                res[i][j] = 1 - image[i][m - 1 - j];
            }
        }
        return res;

    }
}
