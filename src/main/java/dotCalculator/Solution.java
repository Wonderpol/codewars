package dotCalculator;

public class Solution {
    public static String calc(final String txt) {
        String[] testSplit = txt.split(" ");

        final int lengthOfFirstDots = testSplit[0].length();
        final int lengthOfSecondsDots = testSplit[2].length();

        int result = switch (testSplit[1]) {
            case "+" -> lengthOfFirstDots + lengthOfSecondsDots;
            case "*" -> lengthOfFirstDots * lengthOfSecondsDots;
            case "//" -> lengthOfFirstDots / lengthOfSecondsDots;
            case "-" -> lengthOfFirstDots - lengthOfSecondsDots;
            default -> 0;
        };

        return ".".repeat(result);
    }
}
