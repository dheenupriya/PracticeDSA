//https://leetcode.com/problems/maximum-population-year/

public class MaxPopulationYear {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101]; // 1950 → index 0
        for(int[] log: logs)
        {
            years[log[0] - 1950] += 1;
            years[log[1] - 1950] -= 1;
        }
        for (int i = 1; i < 101; i++)
        {
            years[i] += years[i - 1];
        }
        int max = 0;
        int year = 1950;

        for (int i = 0; i < 101; i++) {
            if (years[i] > max) {
                max = years[i];
                year = 1950 + i;
            }
        }
        return year;
    }
}
