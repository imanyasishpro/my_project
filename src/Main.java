public class Main {

    public static void main (String[] args) {

        Account account = new Account(1234,500.00);

        System.out.print("Hi " + account.getCusName() + ". You have " + account.getBalance() + "$ in your account.");
    }

}