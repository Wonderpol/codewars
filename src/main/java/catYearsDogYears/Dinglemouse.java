package catYearsDogYears;

public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        final int[] result = {0, 0, 0};
        result[0] = humanYears;

        for (int i = 1; i < humanYears + 1; i++) {
            if (i < 2) {
                result[1] += 15;
            } else if (i == 2) {
                result[1] += 9;
            } else {
                result[1] += 4;
            }

            if (i < 2) {
                result[2] += 15;
            } else if (i == 2) {
                result[2] += 9;
            } else {
                result[2] += 5;
            }

        }

        return result;
    }
}
