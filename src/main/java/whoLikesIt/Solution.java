package whoLikesIt;

import java.util.Arrays;

public class Solution {
    public static String whoLikesIt(String ... names) {
        if (names.length == 0) return "no one likes this";
        final StringBuilder result = new StringBuilder();

        if (names.length == 1) result.append(names[0]);
        
        if (names.length == 2) {
            result.append(names[0]);
            Arrays.stream(names)
                    .skip(1)
                    .forEach(name -> result.append(" and ").append(name));
        } else if (names.length == 3) {
            result.append(names[0]).append(", ");
            result.append(names[1]).append(" and ").append(names[2]);
        } else if (names.length > 3) {
            result.append(names[0]).append(", ").append(names[1]);
            result.append(" and ").append(names.length - 2).append(" others");
        }

        return result.append(names.length > 1 ? " like this" : " likes this").toString();
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt("Jan", "Adam"));
    }
}
