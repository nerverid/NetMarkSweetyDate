package com.blogspot.nerverid.sweetydate;

public class CurrAccount {
    private int idAccound;
    private String currAccountOfBank;
    private double balans;

    public String getCurrAccount() {
        return currAccountOfBank;
    }

    public void setCurrAccount(String currAccount) {
        this.currAccountOfBank = currAccount;
    }


    public int getIdAccound() {
        return idAccound;
    }

    public void setIdAccound(int idAccound) {
        this.idAccound = idAccound;
    }

    public void addBill(double pay){
        this.balans += pay;
    }

    public void devideBill(double pay){
        this.balans -= pay;
    }

    public double getBalans(){
        return balans;
    }
}
