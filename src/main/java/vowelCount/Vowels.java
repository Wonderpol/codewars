package vowelCount;

import java.util.Arrays;

public class Vowels {
    static int getCount(String str) {
        int vowelsCount = 0;

        Character[] vowelsArray = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < str.length(); i++) {
            if (Arrays.asList(vowelsArray).contains(str.charAt(i))) vowelsCount++;
        }

        return vowelsCount;
    }
}
