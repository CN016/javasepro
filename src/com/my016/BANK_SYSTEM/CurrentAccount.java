package com.my016.BANK_SYSTEM;

public class CurrentAccount extends Account{

    public CurrentAccount() {
    }

    public CurrentAccount(String cardID, double money) {
        super(cardID, money);
    }

    @Override
    public double calc() {
        return getMoney() * 0.0175;
    }
}
