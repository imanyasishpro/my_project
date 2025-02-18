public class Account {

    private int accNumber;
    private double balance;
    private String cusName;
    private String email;
    private String phoneNumber;

    public Account(int accNumber, double balance, String name, String email, String number) {
        this.accNumber = accNumber;
        this.balance = balance;
        cusName = name;
        this.email = email;
        phoneNumber = number;
    }

    public Account(int accNumber, double balance ) {
        this(accNumber, balance, "Malsha", "malsha@gmail.com", "0768500837");
    }
    public int getAccNumber(){
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCusName() {
        return cusName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
