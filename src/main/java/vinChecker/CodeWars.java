package vinChecker;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodeWars {
    public static boolean checkVin(final String vin) {

        if (vin.length() != 17 || vin.contains("I") || vin.contains("O") || vin.contains("Q")) return false;

        Map<String, Integer> lettersToNumbers = new HashMap<>(){{
            put("A", 1);
            put("B", 2);
            put("C", 3);
            put("D", 4);
            put("E", 5);
            put("F", 6);
            put("G", 7);
            put("H", 8);
            put("J", 1);
            put("K", 2);
            put("L", 3);
            put("M", 4);
            put("N", 5);
            put("P", 7);
            put("R", 9);
            put("S", 2);
            put("T", 3);
            put("U", 4);
            put("W", 6);
            put("X", 7);
            put("Y", 8);
            put("Z", 9);
        }};



        final List<String> collect = Arrays.stream(vin.split(""))
                .map(i -> i.matches("[+-]?\\d*(\\.\\d+)?") ? i : String.valueOf(lettersToNumbers.get(i)))
                .toList();

        System.out.println(collect);

        return false;
    }

    public static void main(String[] args) {
        checkVin("5YJ3E1EA7HF000337");
    }
}
