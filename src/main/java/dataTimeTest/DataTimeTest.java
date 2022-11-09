package dataTimeTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DataTimeTest {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.parse("2017-11-30T20:30");

        System.out.println(dt.isAfter(LocalDateTime.parse("2017-11-30T20:30")));
        System.out.println(dt.isBefore(LocalDateTime.parse("2017-11-30T21:20")));
        System.out.println(dt.isEqual(LocalDateTime.parse("2017-11-30T20:20")));
        System.out.println(dt.isAfter(LocalDateTime.parse("2017-11-30T20:20")));
    }
}
