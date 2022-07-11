package partlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partlist {
    static String[][] partlist(final String[] arr) {

        List<String> copiedArray = Arrays.asList(arr);
        List<List<String>> result = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            List<String> arrayResult = new ArrayList<>();
            arrayResult.add(String.join(" ", copiedArray.subList(0, i)));
            arrayResult.add(String.join(" ", copiedArray.subList(i, arr.length)));

            result.add(arrayResult);
        }

        return result.stream()
                .map(lst -> lst.toArray(String[]::new))
                .toArray(String[][]::new);
    }

}
