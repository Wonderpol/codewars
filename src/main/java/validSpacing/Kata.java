package validSpacing;

import java.util.Arrays;
import java.util.Objects;

public class Kata {
    public static boolean validSpacing(String s) {

        if (s.isEmpty()) return false;

        if (s.charAt(0) == ' ' || s.charAt(s.length() - 1) == ' ') {
            return false;
        }
        int numberOfSpaces = (int) s.chars().filter(ch -> ch == ' ').count();

        String[] s1 = s.split(" ");
        s1 = Arrays.stream(s1).filter(word -> !Objects.equals(word, "")).toArray(String[]::new);
        return s1.length - 1 == numberOfSpaces;
//        Better solution
//        return !s.startsWith(" ") && !s.endsWith(" ") && !s.contains("  ");
    }
}
