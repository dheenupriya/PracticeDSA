//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix

public class CellswithOddValuesInMatrix {
        public int oddCells(int m, int n, int[][] indices) {

            //Time complexity - O(k + m*n)

            int[] row = new int[m];
            int[] col = new int[n];

            for(int[] inx: indices)
            {
                row[inx[0]]++;
                col[inx[1]]++;
            }
        /*
        int count = 0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if((row[i]+col[j]) % 2 == 1)
                {
                    count++;
                }
            }
        }
        return count;
        */

            //optimistic approach: int result = (oddRows * evenCols) + (evenRows * oddCols);
            //O(k + m + n)
            int oddRows = 0;
            for(int i = 0; i < m; i++) {
                if(row[i] % 2 == 1) oddRows++;
            }

            int oddCols = 0;
            for(int j = 0; j < n; j++) {
                if(col[j] % 2 == 1) oddCols++;
            }

            int evenRows = m - oddRows;
            int evenCols = n - oddCols;

            int result = (oddRows * evenCols) + (evenRows * oddCols);
            return result;
        }
}
