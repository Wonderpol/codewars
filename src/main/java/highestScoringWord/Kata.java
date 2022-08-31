package highestScoringWord;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Kata {
    public static String high(String s) {

        String[] words = s.split(" ");
        Map<String, Integer> result = new LinkedHashMap<>();

        for (final String word : words) {
            int score = word
                    .chars()
                    .boxed()
                    .map(integer -> integer - 96)
                    .mapToInt(Integer::intValue)
                    .sum();
            System.out.println(score);
        }

        return "";
    }

    public static void main(String[] args) {
        high("aaa b");
    }
}
