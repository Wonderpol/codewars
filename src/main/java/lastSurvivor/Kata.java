package lastSurvivor;

import java.util.Arrays;

public class Kata {
    public static String lastSurvivor(String letters, int[] coords) {
        StringBuilder stringBuilder = new StringBuilder(letters);

        Arrays.stream(coords)
                .boxed()
                .forEach(stringBuilder::deleteCharAt);

        return stringBuilder.toString();
    }
}
