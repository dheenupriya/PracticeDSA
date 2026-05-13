//https://leetcode.com/problems/find-the-highest-altitude/description/

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        //Time Complexity O(n)
        int alti = 0;
        int max = 0;
        int n = gain.length;
        for(int i=0; i<n; i++)
        {
            int var = alti + gain[i];
            alti = var;
            if( alti > max)
            {
                max = alti;
            }
        }
        return max;
    }
}
