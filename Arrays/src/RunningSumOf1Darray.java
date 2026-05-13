//https://leetcode.com/problems/running-sum-of-1d-array/

public class RunningSumOf1Darray {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        //Time complexity O(n^2)
        // int temp = 1;
        // for(int i = 0 ; i < n; i++)
        // {
        //     int sum = 0;
        //     for(int j=0; j< temp; j++)
        //     {
        //         sum += nums[j];
        //     }
        //     temp++;
        //     res[i] = sum;
        // }
        // return res;

        //Time complexity: O(n)
        res[0] = nums[0];

        for(int i = 1; i < n; i++)
        {
            res[i] = res[i-1] + nums[i];
        }
        return res;

    }
}
