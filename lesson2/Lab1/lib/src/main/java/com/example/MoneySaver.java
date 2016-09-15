package com.example;

/**
 * Created by sthirumalai on 9/12/2016.
 */
public class MoneySaver {

    private long myMoney;
    private Account myAccount;
    private String name;


    public MoneySaver(String name, long money) {
        this.name = name;
        myMoney = money;
    }

    public String getName() {
        return name;
    }

    public Account getMyAccount() {
        return myAccount;
    }

    public String toString() {
        return name + ", " + "My balance is: "+ myMoney;
    }

    public void deposit(long amount) {
        myAccount.deposit(amount);
        myMoney = myMoney - amount;
    }

    public void withdraw(long amount) {
        CheckingAccount myCheckingAccount = (CheckingAccount) myAccount;
        myCheckingAccount.withdraw(amount);
        myAccount = myCheckingAccount;
        myMoney = myMoney + amount;
    }

    public void signUpForChecking(int amount) {
        myAccount = new CheckingAccount(amount);
        myMoney = myMoney- amount;
    }

    public static void main(String[] args) {
//        Account a = new Account(100);
//        System.out.println(a);
//        a.setAmount(20);
//        a.deposit(10);
//        System.out.println("New amount: " + a.getAmount());
//
//        Account small = new Account(20);
//        Account big = new Account(30);
//        System.out.println(Account.largerAccount(small, big));

//        MoneySaver david = new MoneySaver("David", 100);
//        david.signUpForChecking(50);  // put 50 dollars in a checking account
//        System.out.println(david);
//        System.out.println(david.getMyAccount());

        MoneySaver jim = new MoneySaver("Jim", 100);
        jim.signUpForChecking(30);
        CheckingAccount acc = (CheckingAccount) jim.getMyAccount();
        System.out.println(jim);
        System.out.println(acc);
        jim.deposit(40);
        System.out.println(jim);
        System.out.println(acc);
        jim.withdraw(60);
        System.out.println(jim);
        System.out.println(acc);
    }
}