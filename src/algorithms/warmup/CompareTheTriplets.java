package algorithms.warmup;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int pointsAlice = 0;
        int pointsBob = 0;

        for (int i = 0; i < a.size(); i++) {
            if(a.get(i)> b.get(i)){
                pointsAlice ++;
            }else if(a.get(i)< b.get(i)){
                pointsBob ++;
            }
        }
        List<Integer> resList = new ArrayList<>();
        resList.add(pointsAlice);
        resList.add(pointsBob);

        return resList;
    }
}
