package theFeastOfManyBeasts;

import java.util.ArrayList;
import java.util.List;

public class Kata {

    private static String[] splitBeastName(String beast) {
        return beast.split(" ");
    }

    private static List<Character> getFirstAndLastLetterOfWordsInArray(String[] arr) {
        List<Character> result = new ArrayList<>();
        if (arr.length < 2) {
            result.add(arr[0].charAt(0));
            result.add(arr[0].charAt(arr[0].length() - 1));
        }
        result.add(arr[0].charAt(0));
        result.add(arr[arr.length - 1].charAt(arr[arr.length - 1].length() - 1));

        return result;
    }

    public static boolean feast(String beast, String dish) {
        List<Character> beastLetters = getFirstAndLastLetterOfWordsInArray(splitBeastName(beast));
        List<Character> dishLetters = getFirstAndLastLetterOfWordsInArray(splitBeastName(dish));

        return beastLetters.get(0) == dishLetters.get(0) && beastLetters.get(1) == dishLetters.get(1);
    }
}
