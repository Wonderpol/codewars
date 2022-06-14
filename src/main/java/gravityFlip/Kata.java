package gravityFlip;

import java.util.Arrays;
import java.util.Collections;

public class Kata {
    public static int[] flip(char dir, int[] arr) {
        if (dir == 'L') {
            arr =
                    Arrays.stream(arr)
                            .boxed()
                            .sorted(Collections.reverseOrder())
                            .mapToInt(Integer::intValue)
                            .toArray();
        }
        else {
            arr = Arrays.stream(arr)
                    .sorted()
                    .toArray();
        }
        return arr;
    }
}
