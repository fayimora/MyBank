package com.fayimora.mybank;

/**
 * Created by fayimora on 31/05/15.
 */
public class SavingsAccount extends BankAccount {
    @Override
    public void withdraw(double amount){
        if(numOfWithdrawals() >= 3)
            return;
        super.withdraw(amount);
    }
}
