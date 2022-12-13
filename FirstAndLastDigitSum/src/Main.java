public class Main {
    public static void main(String[] args) {
        System.out.println("The sum of the First And the Last Digit = " + sumFirstAndLastDigit(2776));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number > 0) {
            // This will provide the first digit at the last run of the loop
            firstDigit = number % 10;
            number /= 10;
        }
        return lastDigit + firstDigit;
    }

}