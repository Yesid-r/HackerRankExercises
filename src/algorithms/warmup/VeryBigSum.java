package algorithms.warmup;

import java.util.List;

public class VeryBigSum {

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here

        Long result = 0L;
        for (int i = 0; i < ar.size(); i++) {
            result += ar.get(i);
        }
        return result;

    }
}
