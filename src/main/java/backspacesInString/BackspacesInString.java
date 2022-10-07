package backspacesInString;

public class BackspacesInString {
    public String cleanString(String s) {
        final StringBuilder result = new StringBuilder();
        final char[] charsS = s.toCharArray();

        result.append(charsS[0]);

        for (int i = 1; i < charsS.length; i++) {
            if (charsS[i] == '#' && !result.isEmpty()) {
                result.deleteCharAt(result.length() - 1);
            } else {
                result.append(charsS[i]);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        final BackspacesInString bis = new BackspacesInString();
        System.out.println(bis.cleanString("#######"));
    }
}
