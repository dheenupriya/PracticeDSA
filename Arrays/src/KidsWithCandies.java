//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int max = candies[0];
            int n =  candies.length;
            List<Boolean> res = new ArrayList<>();
            for(int i = 1; i < n; i++)
            {
                max = Math.max(candies[i], max);
            }
            for(int i=0; i < n; i++)
            {
                int greatest = candies[i] + extraCandies;
                if(greatest >= max)
                {
                    res.add(true);
                }
                else{
                    res.add(false);
                }
            }
            return res;
        }
}
