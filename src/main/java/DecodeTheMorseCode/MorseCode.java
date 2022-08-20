package DecodeTheMorseCode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class MorseCode {

    private static Map<String, String> letters;

    private static void getDataFromFile() throws FileNotFoundException {
        final HashMap<String, String> result = new HashMap<>();

        try (final BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/janpiaskowy/IdeaProjects/demo/Codewars/src/main/java/DecodeTheMorseCode/MorseCodeLetters.txt"))){

            String line = bufferedReader.readLine();


            while (line != null) {
                String[] data = line.split(" ");
                result.put(data[1], data[0]);
                line = bufferedReader.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        letters = result;
    }

    public static String get(String code) throws FileNotFoundException {
        if (letters == null) getDataFromFile();

        return letters.get(code);
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(MorseCode.get("...."));
    }
}
