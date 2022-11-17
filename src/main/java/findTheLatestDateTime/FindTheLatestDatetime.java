package findTheLatestDateTime;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindTheLatestDatetime {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<LocalDateTime> times = new ArrayList<>();
        while (times.size() < n) {
            times.add(LocalDateTime.parse(scanner.nextLine()));
        }

        LocalDateTime minTime = times
                .stream()
                .max(LocalDateTime::compareTo)
                .orElseThrow();
        System.out.println(minTime);
    }
}
