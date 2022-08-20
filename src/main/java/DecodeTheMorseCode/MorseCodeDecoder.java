package DecodeTheMorseCode;

import java.util.Arrays;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {

        final StringBuilder result = new StringBuilder();

        String[] morseWords = morseCode.split("   ");

        for (String word : morseWords) {
            String[] letters = word.toLowerCase().split(" ");
            Arrays.stream(letters).
                    toList()
                    .forEach(result.append());
            result.append(" ");
        }

        return result.toString().trim();
    }
}
