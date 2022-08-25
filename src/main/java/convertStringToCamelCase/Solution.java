package convertStringToCamelCase;

import java.util.Arrays;

public class Solution {
    static String toCamelCase(String s){

        final StringBuilder result = new StringBuilder();
        String[] splittedS = s.replaceAll("_", " ").replaceAll("-", " ").split(" ");

        result.append(splittedS[0]);
        Arrays.stream(splittedS)
                .skip(1)
                .forEach(str -> result.append(str.substring(0, 1).toUpperCase()).append(str.substring(1)));

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the_Stealth_Warrior"));
    }
}
