package algorithms.warmup;

import java.util.List;

public class BirthdayCakeCandles {

    /**
     * Counts the number of tallest candles on a birthday cake.
     *
     * You are in charge of the cake for a child's birthday. You have decided the cake
     * will have one candle for each year of their total age. They will only be able
     * to blow out the tallest of the candles. This function counts how many candles
     * are tallest.
     * Sample Input 0
     *
     * 4
     * 3 2 1 3
     * Sample Output 0
     *
     * 2
     * Explanation 0
     *
     * Candle heights are [3,2,1,3] . The tallest candles are  units, and there are  of them.
     *
     * @param candles List of integers representing the heights of the candles.
     * @return The number of tallest candles.
     */
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Initialize the maximum height to the smallest possible integer value.
        int max = Integer.MIN_VALUE;

        // Initialize the count of the tallest candles to 0.
        int count = 0;

        // Iterate over each candle in the list.
        for (int i = 0; i < candles.size(); i++) {
            // If the current candle is taller than the current maximum height,
            // update the maximum height and reset the count to 1.
            if (candles.get(i) > max) {
                max = candles.get(i);
                count = 1;
            }
            // If the current candle is equal to the current maximum height,
            // increment the count.
            else if (candles.get(i) == max) {
                count++;
            }

            //if(candles.get(candles.size()-1) == candles.get(candles.size()-1-i)){
            //  count ++;
            //}
        }

        // Return the count of the tallest candles.
        return count;
    }
}
