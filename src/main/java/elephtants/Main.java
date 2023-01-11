package elephtants;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 9, 9, 11};
        findAllResults(numbers, 0);
    }

    public static void findAllResults(int[] numbers, int current) {
        if (current == numbers.length - 1) {
            if (numbers[current] == 24) {
                System.out.println("Found 24: " + Arrays.toString(numbers));
            }
            return;
        }
        for (int i = current + 1; i < numbers.length; i++) {
            int a = numbers[current];
            int b = numbers[i];
            numbers[i] = a + b;
            findAllResults(numbers, current + 1);
            numbers[i] = a - b;
            findAllResults(numbers, current + 1);
            numbers[i] = a * b;
            findAllResults(numbers, current + 1);
            if (b != 0) {
                numbers[i] = a / b;
                findAllResults(numbers, current + 1);
            }
            numbers[i] = b;
        }
    }
}
