package theSameLetter;

import java.util.*;


class MapFunctions {

    public static void printWithSameLetter(Map<String, String> map) {
        map.entrySet()
                .stream()
                .filter(e -> e.getKey().substring(0, 1).equals(e.getValue().substring(0, 1)))
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        map.put("Australia", "Canberra");
        map.put("Belgium", "Brussels");
        map.put("Germany", "Berlin");

        MapFunctions.printWithSameLetter(map);
    }
}