package algorithms.warmup;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);


        long minSum = 0, maxSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum += arr.get(i);
            maxSum += arr.get(arr.size()-1 -i);
        }


        System.out.println(minSum + " " + maxSum);
    }
}
