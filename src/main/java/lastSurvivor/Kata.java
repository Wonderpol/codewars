package lastSurvivor;

import java.util.Arrays;

public class Kata {
    public static String lastSurvivor(String letters, int[] coords) {
        for (int i = 0; i < coords.length; i++) {
            letters = letters.substring(coords[i]);
            coords = Arrays.stream(coords).boxed().mapToInt(n -> n - 1).toArray();
        }
        return letters;
    }
}
