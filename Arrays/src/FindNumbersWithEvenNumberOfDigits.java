//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        //formula = log10(n) + 1 - used for counting the length of numbers.
        //log10(1234)≈3.09 + 1 = 4
        int count=0;
        for(int n: nums)
        {
            int number = (int)Math.log10(n) + 1;
            if(number%2==0)
            {
                count++;
            }
        }
        return count;
    }
}
