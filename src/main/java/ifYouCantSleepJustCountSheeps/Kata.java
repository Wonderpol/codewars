package ifYouCantSleepJustCountSheeps;

public class Kata {
    public static String countingSheep(int num) {
        StringBuilder murmur = new StringBuilder();

        if (num == 0) return murmur.toString();

        for(int i = 1; i <= num; i++) {
            murmur.append(i).append(" sheep...");
        }

        return murmur.toString();
    }
}
