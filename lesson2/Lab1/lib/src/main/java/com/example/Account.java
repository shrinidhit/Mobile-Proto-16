package com.example;

/**
 * Created by sthirumalai on 9/12/2016.
 */
public abstract class Account {

    private long amount;

    public Account (long amount) {
        this.amount = amount;
    }

    public long getAmount () {
        return amount;
    }

    public void setAmount (long newAmount) {
        amount = newAmount;
    }

    public String toString() {
        return "Account Balance: $" + amount;
    }

    public void deposit(long depositAmount) {
        setAmount(getAmount() + depositAmount);
    }

    public static Account largerAccount(Account acc1, Account acc2) {
        if (acc1.getAmount() > acc2.getAmount()) {
            return acc1;
        }
        else {
            return acc2;
        }
    }
}
