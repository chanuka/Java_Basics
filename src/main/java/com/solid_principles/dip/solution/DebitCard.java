package com.solid_principles.dip.solution;

public class DebitCard implements BankCard{
    @Override
    public void doTransaction(int amount) {
        System.out.println("tx done with DebitCard");
    }
}
