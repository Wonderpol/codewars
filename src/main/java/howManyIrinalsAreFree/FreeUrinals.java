package howManyIrinalsAreFree;

public class FreeUrinals {
    public static int getFreeUrinals(String urinals){
        final int numberOfFreeUrinals = urinals
                .replaceAll("010|10|01", "1")
                .replaceAll("00", "0")
                .replaceAll("1", "")
                .length();

        return urinals.contains("11") ? -1 : numberOfFreeUrinals;
    }
}
