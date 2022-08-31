package highestScoringWord;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Kata {
    public static String high(String s) {

        String[] words = s.split(" ");
        Map<Integer, String> result = new LinkedHashMap<>();

        for (final String word : words) {
            int score = word
                    .chars()
                    .boxed()
                    .map(integer -> integer - 96)
                    .mapToInt(Integer::intValue)
                    .sum();
            result.put(score, word);
        }

        return result.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getKey)).get().getValue();
    }

    public static void main(String[] args) {
        System.out.println(high("aa b"));
    }
}
