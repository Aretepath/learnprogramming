import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter  = 0;
        int sum = 0;
        while(true){
            int order = counter +1;
            System.out.println("Enter Number #" + order + ":");

            boolean isAntInt = scanner.hasNextInt();

            if(isAntInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10){
                    break;
                }

            }else{
                System.out.println("Invalid Number");
            }
            System.out.println("Sum =" + sum);
            scanner.nextLine(); // handle end of line enter key
        }


//        System.out.println("Enter Number #x:");
//
//        boolean hasNextInt = scanner.hasNextInt();
//
//
//        if (hasNextInt) {
//
//            int number = scanner.nextInt();
//
//            while((number >= 0) && (number <= 10){
//                System.out.println("Enter Number #" +number+":");
//                number++;
//                continue;
//            }
//
//
//        } else {
//            System.out.println("Number entered is out of the loop");
//        }
        scanner.close();
    }
}