package yourOrderPlease;

import java.util.*;

import static java.util.Map.Entry.comparingByKey;

public class Order {
    public static String order(String words) {
        String[] splittedWords = words.split(" ");

        Map<Integer, String> resultMap = new LinkedHashMap<>();

        for (String word : splittedWords) {
            char[] wordChars = word.toCharArray();
            for (char c : wordChars) {
                if (Character.isDigit(c)) {
                    resultMap.put(Character.getNumericValue(c), word);
                }
            }
        }

        final StringBuilder result = new StringBuilder();

        resultMap
                .entrySet()
                .stream()
                .sorted(comparingByKey())
                .forEach(entry -> result.append(entry.getValue()).append(" "));

        return result.toString().trim();
    }
}
