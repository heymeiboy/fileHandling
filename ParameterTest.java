public class ParameterTest {
    public static void main(String[] args)
{
    // create new bank account
    bankAccount testAccount = new bankAccount("1", "Ann T Dote");
    test(testAccount); // send the account to the test method
    System.out.println("Account Number: " + testAccount.getAccountNumber());
    System.out.println("Account Name: " + testAccount.getAccountName());
    System.out.println("Balance: " + testAccount.getAccountBalance());
}
        // a method that makes a deposit in the bank account
        static void test(bankAccount amountIn)
        {
            amountIn.deposit(2500);
        }
    }

