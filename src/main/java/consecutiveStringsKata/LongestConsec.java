package consecutiveStringsKata;

public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length || k <= 0) return "";

        String result = "";

        for (int i = 0; i < strarr.length - k + 1; i++) {
            final StringBuilder stringBuilder = new StringBuilder();
            for (int j = i; j < i + k; j++) {
                stringBuilder.append(strarr[j]);
            }

            if (stringBuilder.toString().length() > result.length()) {
                result = stringBuilder.toString();
            }

        }

        return result;
    }
}
