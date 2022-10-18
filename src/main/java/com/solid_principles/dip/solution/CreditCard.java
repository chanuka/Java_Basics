package com.solid_principles.dip.solution;

public class CreditCard implements BankCard{
    @Override
    public void doTransaction(int amount) {
        System.out.println("tx done with CreditCard");
    }
}
