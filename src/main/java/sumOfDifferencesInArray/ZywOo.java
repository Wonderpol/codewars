package sumOfDifferencesInArray;

import java.util.Arrays;
import java.util.Collections;


public class ZywOo {
    public static int sumOfDifferences(int[] arr) {
        arr = Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        int sum = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            sum += (arr[i] - arr[i + 1]);
        }
        return sum;
    }
}
