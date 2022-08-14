package arrhGrabscrab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grab {
    public static List<String> grabscrab(String s, List<String> words) {
        List<String> result = new ArrayList<>();

        char[] sAsCharArray = s.toCharArray();
        Arrays.sort(sAsCharArray);

        for (String word: words) {
            if (s.length() != word.length()) continue;
            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars);
            if (Arrays.equals(wordChars, sAsCharArray)) {
                result.add(word);
            }
        }
        return result;
    }
}
