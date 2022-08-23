package createPhoneNumber;

import org.junit.platform.commons.util.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {

    public static String createPhoneNumber(int[] numbers) {
        final StringBuilder result = new StringBuilder();

        String joinedNumbers = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(""));

        result.append("(").append(joinedNumbers.substring(0, 3)).append(") ");
        result.append(joinedNumbers.substring(3, 6)).append("-");
        result.append(joinedNumbers.substring(6, 10));

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(Kata.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
