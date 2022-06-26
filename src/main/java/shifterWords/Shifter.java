package shifterWords;

import java.util.*;

public class Shifter {
    public static int count(String st){
        int count = 0;
        HashSet<String> listWithoutDuplicates = new HashSet<>(Arrays.asList(st.split(" ")));

        for (String word: listWithoutDuplicates) {
            if (word.matches("[HINOSXZWM]+")){
                count++;
            }
        }
        return count;
    }
}
