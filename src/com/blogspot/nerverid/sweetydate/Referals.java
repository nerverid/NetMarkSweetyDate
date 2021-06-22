package com.blogspot.nerverid.sweetydate;


import java.util.ArrayList;

public class Referals {

	private ArrayList <Client> referalRecords;

    public Referals(int ids[]){

    }
    public Referals(int id){

    }

    public ArrayList getReferalsRecords(){
        return referalRecords;
    }

    public void setReferalsRecords(Client client) {
        this.referalRecords.add(client);
    }
}
