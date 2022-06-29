package scalingSquaredStrings;

import java.util.Arrays;

public class Scale {
    public static String scale(String strng, int k, int v) {
        final StringBuilder result = new StringBuilder();

        String[] split = strng.split("\n");

        for (final String s : split) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                line.append(String.valueOf(s.charAt(j)).repeat(k));
            }
            result.append(String.valueOf(line + "\n").repeat(v));
        }

        return result.toString().strip();
    }

}
