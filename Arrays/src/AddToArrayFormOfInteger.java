//https://leetcode.com/problems/add-to-array-form-of-integer/description/

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();

        for(int i=num.length-1; i>=0 || k>0; i--)
        {
            if(i>=0)
            {
                k+=num[i];
            }
            res.add(0, k%10);
            k/=10;
        }
        return res;


        //O(n) approach but not recommended
        /*
        StringBuilder sb = new StringBuilder();
        for (int i : num) {
            sb.append(i);
        }
        BigInteger sum = new BigInteger(sb.toString());
        sum = sum.add(BigInteger.valueOf(k));
        String s = String.valueOf(sum);
        int r = s.length();
        List<Integer> result = new ArrayList<>();
        while(sum.compareTo(BigInteger.ZERO) != 0)
        {
            result.add(0, sum.mod(BigInteger.TEN).intValue());
            sum=sum.divide(BigInteger.TEN);
        }
        System.out.println(result);
        return result;
        */
    }
}
