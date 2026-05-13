//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class Panagram {
    public boolean checkIfPangram(String sentence) {

        //Time complexity: O(n)
        int n = sentence.length();
        if(n<26)
        {
            return false;
        }
        int[] arr = new int[26];
        for (char c : sentence.toCharArray()) {
            arr[c - 'a']++;
        }
        for(int i=0; i<26; i++)
        {
            if(arr[i] == 0)
            {
                return false;
            }
        }
        return true;

    }
}
