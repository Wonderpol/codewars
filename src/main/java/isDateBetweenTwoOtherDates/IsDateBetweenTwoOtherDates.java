package isDateBetweenTwoOtherDates;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IsDateBetweenTwoOtherDates {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String[] input = scanner.nextLine().split(" ");

        List<LocalDate> dates =
                Arrays
                        .stream(input)
                        .map(LocalDate::parse)
                        .toList();

        boolean isBetween = (dates.get(0).isAfter(dates.get(1)) && dates.get(0).isBefore(dates.get(2)))
                || (dates.get(0).isAfter(dates.get(2)) && dates.get(0).isBefore(dates.get(1)));
        System.out.println(isBetween);
    }
}
