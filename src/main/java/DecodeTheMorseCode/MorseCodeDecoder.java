package DecodeTheMorseCode;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {

        final StringBuilder result = new StringBuilder();

        String[] morseWords = morseCode.trim().split("   ");

        for (String word : morseWords) {
            String[] letters = word.toLowerCase().split(" ");
            Arrays.stream(letters).
                    toList()
                    .forEach(s -> {
                        try {
                            result.append(MorseCode.get(s));
                        } catch (FileNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    });
            result.append(" ");
        }

        return result.toString().trim();
    }
}
