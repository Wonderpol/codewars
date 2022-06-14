package totalAmountOfPoints;

import java.util.Arrays;

public class TotalPoints {
    public static int points(String[] games) {
        int points = 0;

        for (String game : games) {
            String[] gameScores = game.split(":");
            if(Integer.parseInt(gameScores[0]) > Integer.parseInt(gameScores[1])) {
                points += 3;
            } else if (Integer.parseInt(gameScores[0]) == Integer.parseInt(gameScores[1])) {
                points++;
            }
        }

        return points;
    }
}
