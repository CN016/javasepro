package com.my016.ATM_SYSTEM;

public class UserAccount {
    private int IDCard;
    private String passWord;
    private  double allMoney;
    private String userName;
    private double limitedNumber;

    public UserAccount() {
    }

    public UserAccount(int IDCard, String passWord, double allMoney, String userName, double limitedNumber) {
        this.IDCard = IDCard;
        this.passWord = passWord;
        this.allMoney = allMoney;
        this.userName = userName;
        this.limitedNumber = limitedNumber;
    }

    public int getIDCard() {
        return IDCard;
    }

    public void setIDCard(int IDCard) {
        this.IDCard = IDCard;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(double allMoney) {
        this.allMoney = allMoney;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getLimitedNumber() {
        return limitedNumber;
    }

    public void setLimitedNumber(double limitedNumber) {
        this.limitedNumber = limitedNumber;
    }
}
