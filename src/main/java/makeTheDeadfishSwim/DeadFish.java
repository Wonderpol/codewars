package makeTheDeadfishSwim;

import java.util.ArrayList;
import java.util.List;

public class DeadFish {
    public static int[] parse(String data) {
        char[] dataChArr = data.toCharArray();

        int value = 0;
        List<Integer> result = new ArrayList<>();

        for (final char c : dataChArr) {
            switch (c) {
                case 'i' -> value++;
                case 'd' -> value--;
                case 's' -> value *= value;
                case 'o' -> result.add(value);
                default -> throw new IllegalArgumentException("This letter is not valid: " + c);
            }
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
