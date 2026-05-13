//leetcode: https://leetcode.com/problems/build-array-from-permutation/

class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums)
    {
//        int[] ans = new int[nums.length];
//        for(int i = 0; i < nums.length; i++)
//        {
//            ans[i] = nums[nums[i]];
//        }
//        return ans;
        int n = nums.length;

        // Step 1: Encode both values
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }

        // Step 2: Decode to get final answer
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }

        return nums;
    }
}