public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");


        BankAccount bobsAccount = new BankAccount("123",0.00,"Robert Clark","richard@clark.com","07946255637");
        bobsAccount.withdrawal(100.0);
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());


        bobsAccount.deposit(50.00);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.00);
        bobsAccount.withdrawal(100.0);

        BankAccount richardsAccount = new BankAccount("Richard","richard@clark.com","07946255637");
        System.out.println(richardsAccount.getAccountNumber() + ": Name " + richardsAccount.getCustomerName() + "Number " + richardsAccount.getPhoneNumber());
        System.out.println(richardsAccount.getBalance());
        richardsAccount.deposit(50);
        richardsAccount.withdrawal(100.55);
    }
}