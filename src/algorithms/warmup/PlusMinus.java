package algorithms.warmup;

import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 0) {
                zero++;
            } else if(arr.get(i) > 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.printf("%.6f\n", (double) positive / arr.size());
        System.out.printf("%.6f\n", (double) negative / arr.size());
        System.out.printf("%.6f\n", (double) zero / arr.size());
    }
}
