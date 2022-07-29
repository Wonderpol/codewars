package whereIsMyParent;

import java.util.Arrays;

public class WhereIsMyParent {
    static String findChildren(String text) {

        if (text.isEmpty() || text.isBlank()) return "";

        StringBuilder result = new StringBuilder();

        char[] characters = text.toLowerCase().toCharArray();
        Arrays.sort(characters);

        char previousLetter = characters[0];
        result.append(String.valueOf(previousLetter).toUpperCase());
        for (int i = 1; i < characters.length; i++) {
            if (characters[i] != previousLetter) {
                result.append(String.valueOf(characters[i]).toUpperCase());
            } else {
                result.append(String.valueOf(characters[i]));
            }
            previousLetter = characters[i];
        }

        return result.toString();
    }
}
