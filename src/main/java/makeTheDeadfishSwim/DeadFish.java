package makeTheDeadfishSwim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeadFish {
    public static int[] parse(String data) {
        char[] dataChArr = data.toCharArray();

        int value = 0;
        List<Integer> result = new ArrayList<>();

        for (final char c : dataChArr) {
            switch (c) {
                case 'i':
                    value++;
                    break;
                case 'd':
                    value--;
                    break;
                case 's':
                    value *= value;
                    break;
                case 'o':
                    result.add(value);
                    break;
                default:
                    break;
            }
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(parse("iiisdosos")));
    }
}
