package backspacesInString;

import java.util.ArrayList;
import java.util.List;

public class BackspacesInString {
    public String cleanString(String s) {
        final StringBuilder string = new StringBuilder();
        final char[] charsS = s.toCharArray();

        for (char ch: charsS) {
            if (ch == '#' && !string.isEmpty()) {
                string.deleteCharAt(string.length() - 1);
            } else {
                string.append(ch);
            }
        }

        return string.toString();
    }

    public static void main(String[] args) {
        final BackspacesInString bis = new BackspacesInString();
    }
}
