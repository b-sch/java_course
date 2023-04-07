public class BankAccount {
    private long accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(){
        this(56789, 0.0d, "Default Name", "Default Email", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(long accountNumber, double accountBalance, String customerName, String customerEmail, String customerPhoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this(99999, 100.00d, customerName, customerEmail, customerPhoneNumber);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void displayAccountBalance() {
        System.out.println("Current account balance is = " + getAccountBalance() + "\n");
    }

    public void depositFunds(double depositAmount){
        System.out.println("Depositing " + depositAmount);

        if (depositAmount < 0) {
            System.out.println("Invalid input data - can't deposit negative amount");
        } else {
            setAccountBalance(accountBalance + depositAmount);
        }

        displayAccountBalance();
    }

    public void withdrawFunds(double withdrawAmount){
        System.out.println("Withdrawing " + withdrawAmount);

        if (withdrawAmount < 0) {
            System.out.println("Invalid input data - can't withdraw negative amount");
        } else if (withdrawAmount > getAccountBalance()){
            System.out.println("Invalid input data - insufficient funds available");
        } else {
            setAccountBalance(accountBalance - withdrawAmount);
        }

        displayAccountBalance();
    }
}
