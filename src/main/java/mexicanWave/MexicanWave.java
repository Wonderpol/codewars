package mexicanWave;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanWave {
    public static String[] wave(String str) {

        List<String> result = new ArrayList<>();
        char[] strArr = str.toCharArray();

        for (int i = 0; i < strArr.length; i++) {
            final StringBuilder word = new StringBuilder();

            if (Character.toString(str.charAt(i)).equals(" ")) continue;

            word
                    .append(str.substring(0, i))
                    .append(Character.toUpperCase(str.charAt(i)))
                    .append(str.substring(i + 1));

            result.add(word.toString());
        }

        return result.toArray(String[]::new);
    }
}
