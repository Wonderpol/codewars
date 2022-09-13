package aWolfInSheepsClothing;

import java.util.Arrays;

public class ZywOo {
    public static String warnTheSheep(String[] array) {
        if (array[array.length - 1].equals("wolf")){
            return "Pls go away and stop eating my sheep";
        }

        int indexOfWolf = Arrays.asList(array).indexOf("wolf");

        return "Oi! Sheep number "
                + (array.length - 1 - indexOfWolf)
                +"! You are about to be eaten by a wolf!";
    }
}
