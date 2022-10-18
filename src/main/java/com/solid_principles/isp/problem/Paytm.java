package com.solid_principles.isp.problem;

public class Paytm implements UPIPayments{ // paytm has no function to getCashBackAsCreditBalance
    @Override
    public void payMoney() {
        //logic
    }

    @Override
    public void getScratchCard() {
    //logic
    }

    @Override
    public void getCashBackAsCreditBalance() {
    //Not Applicable
    }
}
