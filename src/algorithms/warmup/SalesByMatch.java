package algorithms.warmup;



import java.util.HashMap;
import java.util.List;

public class SalesByMatch {
    /*
            Sample Input

        STDIN                       Function
        -----                       --------
        9                           n = 9
        10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
        Sample Output

        3
     */
    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer, Integer> group = new HashMap<>();

        for (int sock : ar) {
            group.put(sock, group.getOrDefault(sock, 0) + 1);
        }

        int count = 0;
        for (int quantity : group.values()) {
            count += quantity / 2;
        }

        return count;
    }
}
