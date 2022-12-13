public class Main {
    public static void main(String[] args) {
        System.out.println("isPalindrome = " +isPalindrome(432));
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int temp = number;

        while (temp != 0) {
            int lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
        }
        return number == reverse;
    }

}