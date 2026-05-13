public class SmallerThantheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //complexity: O(n^2)
        /*
        int n = nums.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++)
        {
            int count = 0;
            int j = 0;
            while (j < n)
            {
                if (i != j && nums[j] < nums[i]) {
                    count++;
                }
                j++;
            }
            res[i] = count;
        }
        return res;
        */
        //Time Complexity - O(n log n)
        /*
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();

        // store first occurrence index
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], i);
            }
        }

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = map.get(nums[i]);
        }

        return res;
        */
        //Time Complexity - O(n)
        int[] count = new int[101]; // range 0–100

        // Step 1: count frequency
        for (int num : nums) {
            count[num]++;
        }

        // Step 2: prefix sum
        for (int i = 1; i < 101; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: build result
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                res[i] = 0;
            } else {
                res[i] = count[nums[i] - 1];
            }
        }

        return res;
    }
}
