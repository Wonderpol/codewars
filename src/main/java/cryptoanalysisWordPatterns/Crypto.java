package cryptoanalysisWordPatterns;

import java.util.*;

public class Crypto {
    public static String wordPattern(final String word){
        final List<Character> characters = new ArrayList<>();

        final StringBuilder result = new StringBuilder();

        String lowercaseString = word.toLowerCase();

        for (int i = 0; i < lowercaseString.length(); i++) {
            if (!characters.contains(lowercaseString.charAt(i))) {
                characters.add(lowercaseString.charAt(i));
            }

            if (i != 0) result.append(".");
            result.append(characters.indexOf(lowercaseString.charAt(i)));

        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("hello"));
    }
}
