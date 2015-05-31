package com.fayimora.mybank;

import java.util.ArrayList;

/**
 * Created by fayimora on 31/05/15.
 */
public class BankAccount {
    private double mBalance;
    private ArrayList<Double> mTransactions;

    public static final double OVERDRAFT_FEE = 30;

    public BankAccount(){
        mBalance = 0.0;
        mTransactions = new ArrayList<>();
    }

    public void withdraw(double amount){
        mTransactions.add(-amount);
        if(getBalance() < 0)
            mTransactions.add(-OVERDRAFT_FEE);
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
