package com.fayimora.accounts;

import java.util.ArrayList;

/**
 * Created by fayimora on 31/05/15.
 */
public abstract class BankAccount {
    private double mBalance;
    private ArrayList<Double> mTransactions;

    public static final double OVERDRAFT_FEE = 30;

    protected BankAccount(){
        mBalance = 0.0;
        mTransactions = new ArrayList<>();
    }

    public void withdraw(double amount){
        mTransactions.add(-amount);
        if(getBalance() < 0)
            mTransactions.add(-OVERDRAFT_FEE);
    }

    protected int numOfWithdrawals(){
        int count = 0;
        for(Double t: mTransactions)
            if(t < 0.0)
                count++;
        return count;
    }

    public void deposit(double amount){
        mTransactions.add(amount);
    }

    public double getBalance(){
        double sum = 0.0;
        for(Double t: mTransactions)
            sum += t;
        return sum;
    }
}
