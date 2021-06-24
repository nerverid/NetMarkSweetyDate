package com.blogspot.nerverid.sweetydate;


import java.util.ArrayList;

public class Referals {

	private ArrayList <Client> referalRecords;
    private int id;

    public Referals(int id){
        this.id = id;
        referalRecords = new ArrayList<Client>();
    }

    public ArrayList getReferalsRecords(){
        return referalRecords;
    }

    public void setReferalsRecords(Client client) {
        this.referalRecords.add(client);
    }
}
