package mexicanWave;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {
    public static String[] wave(String str) {

        char[] strArr = str.toCharArray();

        List<String> result = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {

            String word = str.replace(str.charAt(i), Character.toUpperCase(strArr[i]));

            result.add(word);
        }

        return new String[] {};
    }

    public static void main(String[] args) {
        wave("hello");
    }
}
