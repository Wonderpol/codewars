package fourSeven;

import java.util.Map;
import java.util.TreeMap;

public class Kata {
    public static int fourSeven(int n){
        final Map<Integer, Integer> integerMap = Map.of(4, 7, 7, 4);

        return integerMap.getOrDefault(n, 0);
    }
}
