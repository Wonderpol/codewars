package frequencyOfCharacters;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String inputChars = scanner.nextLine();
        String givenCharacter = scanner.nextLine();

        long result = Arrays.stream(inputChars
                        .split(" "))
                .filter(s -> s.equals(givenCharacter))
                .count();
        System.out.println(result);
    }
}
