//https://leetcode.com/problems/create-target-array-in-the-given-order/description/

import java.util.ArrayList;
import java.util.List;

public class CreateArrayInTheGivenInteger {
    public int[] createTargetArray(int[] nums, int[] index) {
        //Time Complexity - O(n)
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++)
        {
            list.add(index[i],nums[i]);
        }
        for (int i = 0; i < n; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
