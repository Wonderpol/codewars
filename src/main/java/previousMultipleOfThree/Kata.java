package previousMultipleOfThree;

public class Kata {
    public static Integer prevMultOfThree(int n){

        if (n % 3 == 0) return n;

        String stringOfNumber = String.valueOf(n);

        for (int i = 1; i < stringOfNumber.length(); i++) {
            int number = Integer.parseInt(stringOfNumber.substring(0, stringOfNumber.length() - i));
            if (number % 3 == 0) {
                return number;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(prevMultOfThree(25));
    }
}
