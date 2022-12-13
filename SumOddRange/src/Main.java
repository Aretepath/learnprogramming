public class Main {
    public static void main(String[] args) {
        sumOdd(2,50);
        System.out.println(isOdd(51));
        System.out.println(sumOdd(2,50));

    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((start < 0) || (end < start)) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;

    }
}