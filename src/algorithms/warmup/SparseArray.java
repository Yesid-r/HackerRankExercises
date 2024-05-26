package algorithms.warmup;

import java.util.ArrayList;
import java.util.List;

public class SparseArray {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            int instances = 0;
            for (int j = 0; j < strings.size(); j++) {
                if(queries.get(i).equals(strings.get(j))){
                    instances ++;
                }
            }
            result.add(instances);
        }
        return result;
    }
}
