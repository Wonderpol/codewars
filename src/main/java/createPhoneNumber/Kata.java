package createPhoneNumber;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {

    public static String createPhoneNumber(int[] numbers) {
        final StringBuilder result = new StringBuilder();

        String joinedNumbers = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(""));

        result.append("(").append(joinedNumbers, 0, 3).append(") ");
        result.append(joinedNumbers, 3, 6).append("-");
        result.append(joinedNumbers.substring(6, 10));

        return result.toString();
    }

}
