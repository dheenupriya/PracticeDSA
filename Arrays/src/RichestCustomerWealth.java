//https://leetcode.com/problems/richest-customer-wealth/submissions/1964496117/

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int len = accounts.length;
        int wealthy = 0;
        for(int row = 0; row < len; row++)
        {
            int sum = 0;
            for(int col = 0; col < accounts[row].length; col++)
            {
                sum += accounts[row][col];
            }
            wealthy = Math.max(wealthy, sum);
        }
        return wealthy;
    }
}
//Time Complexity: O(m x n)