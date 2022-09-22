package theMaximumProductOfAdjacentElements;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 0;

        final Scanner scanner = new Scanner(System.in);
        int numberOfElements = Integer.parseInt(scanner.nextLine());

       int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::valueOf)
                .toArray();

        for (int i = 0; i < arr.length - 1; i++) {
           int product = arr[i] * arr[i + 1];
           if (product > result) result = product;
        }

        System.out.println(result);

    }
}
