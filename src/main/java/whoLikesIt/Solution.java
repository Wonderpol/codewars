package whoLikesIt;

import java.util.Arrays;

public class Solution {
    public static String whoLikesIt(String ... names) {
        int a = 300, b = a++, c = --b;

        System.out.println(c);
        switch (names.length) {
            case 0: return "no one likes this";
            case 1: return String.format("%s likes this", names[0]);
            case 2: return String.format("%s and %s like this", names[0], names[1]);
            case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt("Jan", "Adam"));
    }
}
