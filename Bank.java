    import java.util.*;
public class Bank {
    List<bankAccount> list = new ArrayList<>();

    // helper method to find the index of a specified account
    private int search (String accountNumberIn) {
        for (int i = 0; i <= list.size() - 1; i++) //why is there minus 1 after the list.size()
        {
            bankAccount tempAccount = list.get(i); // find the account at index i
            String tempNumber = tempAccount.getAccountNumber(); // get account number
            if (tempNumber.equals(accountNumberIn)) // if this is the account we are looking for
            {
                return i; // return the index
            }
        }
        return -999;
    }

    //get Account Name
    private void getName (String accountNumberIn) {
        for (int i = 0; i <= list.size() - 1; i++) //why is there minus 1 after the list.size()
        {
            bankAccount tempAccount = list.get(i); // find the account at index i
            String tempName = tempAccount.getAccountName(); // get account number
            if (tempName != null) // if this is the account we are looking for
            {
                System.out.print(tempName);// return the index
            } else {
                System.out.print("No Such Account");
            }
        }
    }

    // return the total number of items
    public int getTotal () {
        return list.size();
    }

    // return an account with a particular account number
    public bankAccount getItem (String accountNumberIn) {
        int index = search(accountNumberIn);
        if (index != -999) // check that account exists
        {
            return list.get(index);
        } else {
            return null; // no such account
        }
    }

    // add an item to the list
    public boolean addAccount (String accountNumberIn, String nameIn) {
        if (search(accountNumberIn) == -999) // check that account does not already exist
        {
            list.add(new bankAccount(accountNumberIn, nameIn)); // add new account
            return true;
        }
        return false;
    }

    // deposit money in a specified account
    public boolean depositMoney (String accountNumberIn, double amountIn) {
        bankAccount acc = getItem(accountNumberIn);
        if (acc != null) {
            acc.deposit(amountIn);
            return true; // indicate success
        } else {
            return false; // indicate failure
        }
    }

    public boolean checkLoanStatus(String number){
            double loan = bankAccount.loan;
            double maxLoan = 2000;
            if (loan > maxLoan){
                return false;
            }else {
                return true;
            }
    }

    // withdraw money from a specified account
    public boolean withdrawMoney (String accountNumberIn, double amountIn) {
        bankAccount acc = getItem(accountNumberIn);
        if (acc != null && acc.getAccountBalance() >= amountIn) {
            acc.withdrawl(amountIn);
            return true; // indicate success
        } else {
            return false; // indicate failure
        }
    }

    // remove an account
    public boolean removeAccount (String accountNumberIn) {
        int index = search(accountNumberIn); // find index of account
        if(index != -999) // if account exists account
        {
            bankAccount accountNo = list.get(index);
            String accountName = accountNo.getAccountName();
            list.remove(index);
            System.out.println(accountName + " with account number "+ accountNumberIn + " Sucessfully removed" );
            return true; // remove was successful
        }
        else
        {
            System.out.println("Account Invalid");
            return false; // remove was unsuccessful
        }
    }
}
