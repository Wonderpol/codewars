package DecodeTheMorseCode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Map;

public class MorseCode {

    private static Map<String, String> letters;

    private static void getDataFromFile() throws FileNotFoundException {
        try (final BufferedReader bufferedReader = new BufferedReader(new FileReader("MorseCodeLetters.txt"));){

            String line = bufferedReader.readLine();

            while (line != null) {
                String[] data = line.toString().split(" ");
                letters.put(data[1], data[0]);

                line = bufferedReader.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String get(String code) throws FileNotFoundException {
        if (letters.isEmpty()) getDataFromFile();

        return letters.get(code);
    }

}
