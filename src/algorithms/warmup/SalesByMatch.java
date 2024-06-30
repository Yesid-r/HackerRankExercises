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
        // Write your code here
        HashMap<Integer, Integer> group = new HashMap<Integer, Integer>();
        for (int i = 0; i < ar.size(); i++) {
            if(group.get(ar.get(i)) == null){
                group.put(ar.get(i), 1);
            }else{
                group.put(ar.get(i), group.get(ar.get(i)) +1 );
            }
        }
        int count = 0;
        for (Integer integer : group.values()) {
            count += (integer/2 > 0) ? (int) integer/2 : 0;
        }
        return count;
    }
}
