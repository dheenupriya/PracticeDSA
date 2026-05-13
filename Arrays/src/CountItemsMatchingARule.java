//https://leetcode.com/problems/count-items-matching-a-rule/

import java.util.List;

public class CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        //Time Complexity: O(n)
        int n = items.size();
        int count=0;
        // for(int i=0; i<items.size(); i++)
        // {
        //     if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue))
        //     {
        //         count++;
        //     }
        //     else if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue))
        //     {
        //         count++;
        //     }
        //     else if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue))
        //     {
        //         count++;
        //     }
        // }
        int index = 0;

        if(ruleKey.equals("type")){
            index = 0;
        }
        else if(ruleKey.equals("color")){
            index = 1;
        } else {
            index = 2;
        }
        for(int i = 0; i < n; i++){
            if(items.get(i).get(index).equals(ruleValue)) {
                count ++;
            }
        }
        return count;
    }
}
