package theHighestProfitWins;

import java.util.Arrays;

public class MinMax {
    public static int[] minMax(int[] arr) {
        return new int[] { Arrays.stream(arr).min().orElseThrow(), Arrays.stream(arr).max().orElseThrow() };
    }
}
