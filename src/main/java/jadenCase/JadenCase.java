package jadenCase;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class JadenCase {
    public static String toJadenCase(String phrase) {
        if (phrase != null && !phrase.isBlank()) {
            String[] phraseWords = phrase.split(" ");

           return Arrays.stream(phraseWords)
                    .map(s -> s.isEmpty() ? "" : s.substring(0, 1).toUpperCase() + s.substring(1))
                    .collect(Collectors.joining(" "));
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase("jan ma kota"));
        System.out.println(toJadenCase(null));
    }
}
