package mexicanWave;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanWave {
    public static String[] wave(String str) {

        List<String> result = new ArrayList<>();
        char[] strArr = str.toCharArray();

        for (int i = 0; i < strArr.length; i++) {
            String word = str.replace(str.charAt(i), Character.toUpperCase(strArr[i]));
            result.add(word);
        }

        return result.toArray(String[]::new);
    }

    public static void main(String[] args) {
        wave("hello");
    }
}
