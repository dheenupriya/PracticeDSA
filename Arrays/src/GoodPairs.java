//https://leetcode.com/problems/number-of-good-pairs/

import java.util.HashMap;
import java.util.Map;

public class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        //This problem can be done by brute force method with time complexity O(n^2)
        //Doing it with O(n) solution
        //map.getOrDefault(key, defaultValue)

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0 ; i< nums.length; i++)
        {
            int freq = map.getOrDefault(nums[i], 0);
            count += freq;
            map.put(nums[i], freq+1); //adding one as it occured once.
        }
        return count;

    }
}
