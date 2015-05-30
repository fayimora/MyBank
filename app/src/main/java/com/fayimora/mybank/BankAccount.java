package com.fayimora.mybank;

/**
 * Created by fayimora on 31/05/15.
 */
public class BankAccount {
    private double balance;

    public BankAccount(){
        balance = 0.0;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public double getBalance(){
        return balance;
    }
}
