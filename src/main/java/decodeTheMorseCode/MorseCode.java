package decodeTheMorseCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCode {
    private static Map<String, String> letters;
    private static final String FILE_PATH = "src/main/resources/MorseCodeLetters.txt";

    private static void getDataFromFile() {
        final HashMap<String, String> result = new HashMap<>();

        try (final Scanner scanner = new Scanner(new File(FILE_PATH))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(" ");
                result.put(data[1], data[0]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        letters = result;
    }

    public static String get(String code) throws FileNotFoundException {
        if (letters == null) getDataFromFile();

        return letters.get(code);
    }
}
