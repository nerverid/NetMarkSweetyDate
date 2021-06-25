package com.blogspot.nerverid.sweetydate;

public class CurrAccount {
    private int idAccound;
    private String currAccount;
    private double bill;

    public String getCurrAccount() {
        return currAccount;
    }

    public void setCurrAccount(String currAccount) {
        this.currAccount = currAccount;
    }


    public int getIdAccound() {
        return idAccound;
    }

    public void setIdAccound(int idAccound) {
        this.idAccound = idAccound;
    }

    public void addBill(double pay){
        this.bill += pay;
    }

    public void devideBill(double pay){
        this.bill -= pay;
    }
}
