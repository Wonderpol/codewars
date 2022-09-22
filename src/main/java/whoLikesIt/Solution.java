package whoLikesIt;

import java.util.Arrays;

public class Solution {
    public static String whoLikesIt(String ... names) {
        if (names.length == 0) return "no one likes this";
        final StringBuilder result = new StringBuilder();

        if (names.length < 4) {
            result.append(names[0]);
            Arrays.stream(names)
                    .skip(1)
                    .forEach(name -> result.append(" and ").append(name));
        }

        return result.append(names.length > 1 ? " like this" : " likes this").toString();
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt("Jan", "Adam"));
    }
}
