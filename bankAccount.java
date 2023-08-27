public class bankAccount {
    private String accountNumber;
    private String accountName;
    private double accountBalance;
    public static double loan;
    public static double Maxloan;

    public bankAccount(String accountNumber, String accountNames){
        this.accountNumber=accountNumber;
        this.accountName = accountNames;
        this.accountBalance = 0;
        this.loan = 0.0;
        this.Maxloan = 2000;
    }

    public void addLoan(double amount){
        loan =+ amount;
    }

    public void setMaxloan (double amount) {
        Maxloan =- amount;
    }

    public double getLoan(){
        return loan;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountName(){
        return accountName;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public void deposit(double amount){
        this.accountBalance=this.accountBalance + amount;
    }

    public boolean withdrawl(double amount){
        if (amount > this.accountBalance){
            return false;
        }else{
            this.accountBalance=this.accountBalance - amount;
        }return true;
    }

    @Override
    public String toString () {
        return "bankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}
