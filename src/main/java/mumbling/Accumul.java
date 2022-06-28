package mumbling;

import java.util.Arrays;

public class Accumul {
    public static String accum(String s) {

        String[] resultArr = new String[s.length()];
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            resultArr[i] = String.valueOf(Character.toUpperCase(s.charAt(i)));
            resultArr[i] += String.valueOf(s.charAt(i)).repeat(i);
        }

        return String.join("-", resultArr);
    }
}
