package mexicanWave;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanWave {
    public static String[] wave(String str) {

        List<String> result = new ArrayList<>();
        char[] strArr = str.toCharArray();

        for (int i = 0; i < strArr.length; i++) {
            final StringBuilder word = new StringBuilder(str);
            word.setCharAt(i, Character.toUpperCase(strArr[i]));

            result.add(word.toString());
        }

        return result.toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(wave("hello")));
    }
}
