package algorithms.warmup;

import java.util.ArrayList;
import java.util.List;

public class CountingSort1 {

    /*
            Alternative Sorting
        Another sorting method, the counting sort, does not require comparison. Instead, you create an integer array whose index range covers the entire range of values in your array to sort. Each time a value occurs in the original array, you increment the counter at that index. At the end, run through your counting array, printing the value of each non-zero valued index that number of times.

        Example

        All of the values are in the range , so create an array of zeros, . The results of each iteration follow:

        i	arr[i]	result
        0	1	[0, 1, 0, 0]
        1	1	[0, 2, 0, 0]
        2	3	[0, 2, 0, 1]
        3	2	[0, 2, 1, 1]
        4	1	[0, 3, 1, 1]

        constraints:
        100 <=n <=10^6
        0<= arr[i) < 100
     */
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int[] frequencyArrays = new int[100];
        for (Integer i : arr) {
            frequencyArrays[i] ++;
        }
        for (int i = 0; i < 100; i++) {
            result.add(frequencyArrays[i]);
        }
        return result;
    }
}
