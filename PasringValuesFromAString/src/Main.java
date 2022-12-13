public class Main {
    public static void main(String[] args) {
        String numberAsString = "2016.125";
        System.out.println("numberAsString= " + numberAsString);
       // int number = Integer.parseInt(numberAsString);
        double number = Double.parseDouble(numberAsString);
        System.out.println("ParsingnumberAsString= " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("number as string = " +numberAsString);
        System.out.println("Number = " + number);
    }
}