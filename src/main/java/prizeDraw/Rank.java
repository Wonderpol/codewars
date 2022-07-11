package prizeDraw;

import java.util.*;
import java.util.stream.Collectors;

public class Rank {
    public static String nthRank(String st, Integer[] we, int n) {

        if (st.equals("")) return "No participants";

        Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'W', 'X', 'Y', 'Z'};

        List<String> names = Arrays.asList(st.split(","));

        if (n > names.size()) return "Not enough participants";

        final Map<String, Integer> namesAndWinningNumber = new HashMap<>();

        for (String name: names) {
            int som = name.length();
            for (int i = 0; i < name.length(); i++) {
                som += Arrays.asList(alphabet).indexOf(name.toUpperCase().charAt(i)) + 1;
            }
            namesAndWinningNumber.put(name, som * we[names.indexOf(name)]);
        }

        final LinkedHashMap<String, Integer> sortedRanking = namesAndWinningNumber.entrySet().stream()
                .sorted((o1, o2) -> {
                    if (!Objects.equals(o1.getValue(), o2.getValue())) {
                        return o2.getValue() - o1.getValue();
                    }
                    return o1.getKey().compareTo(o2.getKey());
                })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println(sortedRanking);

        return List.copyOf(sortedRanking.keySet()).get(n - 1);
    }
}


