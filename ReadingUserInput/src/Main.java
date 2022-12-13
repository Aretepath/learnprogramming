import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Year of Birth:");

        boolean hasNextInt = scanner.hasNextInt();


        if (hasNextInt) {

            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //hanlde next line character (Enter key)

            System.out.println("Enter Your name: ");
            String name = scanner.nextLine();
            int age = 2022 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " Years old.");
            } else {
                System.out.println("Invalid Year of Birth");

            }

        } else {
            System.out.println("Unable to Parse the year of Birth!");
        }
        scanner.close();
    }
}