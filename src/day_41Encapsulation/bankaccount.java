package day_41Encapsulation;

import day_36CustomClass.bankOfAmerica;

public class bankaccount {
    /*create costum class called BankAccount for Bank of America
    public variables:  bankName, firstName, lastName
    private variables: accountHolder, accountNumber, balance
    encapsulate all the private data
            (DO NOT USE SHORTCUT)
    create a constructor that can initialize firstName and lastName
            (DO NOT USE SHORTCUT)
    public methods:
    deposit
            withdraw
    availableBalance*/

    public final static String bankOfAmerica = "Bank of America";
    public String firstname, lastname;
    private String accountholder;
    private int accountnumber;
    private double balance;

    public static String getBankOfAmerica() {
        return bankOfAmerica;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAccountholder() {
        return accountholder;
    }

    public void setAccountholder(String accountholder) {
        this.accountholder = accountholder;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
