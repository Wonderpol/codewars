package phoneWords;

import java.util.HashMap;
import java.util.Map;

public class PhoneWords {

    private static final Map<String, String> letterWithKeyRelations = new HashMap<>() {{
        put("A", "2");
        put("B", "22");
        put("C", "222");

        put("D", "3");
        put("E", "33");
        put("F", "333");

        put("G", "4");
        put("H", "44");
        put("I", "444");

        put("J", "5");
        put("K", "55");
        put("L", "555");

        put("M", "6");
        put("N", "66");
        put("O", "666");

        put("P", "7");
        put("Q", "77");
        put("R", "777");
        put("S", "7777");

        put("T", "8");
        put("U", "88");
        put("V", "888");

        put("W", "9");
        put("X", "99");
        put("Y", "999");
        put("Z", "9999");

    }};

    public static String phoneWords(String str) {
        final StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            String letter = String.valueOf(str.charAt(i));
            System.out.println(letter);
            result.append(letterWithKeyRelations.getOrDefault(letter.toUpperCase(), ""));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        phoneWords("kata");
    }
}
