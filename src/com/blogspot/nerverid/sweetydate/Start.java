package com.blogspot.nerverid.sweetydate;

import com.blogspot.nerverid.sweetydate.displayui.UiDisplay;

public class Start {
    public Start(){
        //UiDisplay uiDisplay = new UiDisplay();
        Client clint1 = new Client();
        clint1.setFirstName("John");
        clint1.setIdClient(0);
        CurrAccount clnt1CurAcc = new CurrAccount();
        clnt1CurAcc.setIdAccound(1);
        clnt1CurAcc.setCurrAccount("40817810099040705");
        clnt1CurAcc.addBill(5);
        clint1.setCurAccount(clnt1CurAcc);
        System.out.println(clnt1CurAcc.getBalans());
        System.out.println(clint1.getFirstName());
        Client clint2 = new Client();
        clint1.setFirstName("John1");
        clint1.setIdClient(1);
        System.out.println(clint1.getFirstName());
        Client clint3 = new Client();
        clint1.setFirstName("John2");
        clint1.setIdClient(2);
        System.out.println(clint1.getFirstName());
        Client clint4 = new Client();
        clint1.setFirstName("John3");
        clint1.setIdClient(3);
        System.out.println(clint1.getFirstName());
        Referals ref1 = new Referals(1);
        clint1.setReferals(ref1);

        ref1.setReferalsRecords(clint2); 
        ref1.setReferalsRecords(clint3);
        ref1.setReferalsRecords(clint4);
        System.out.println(ref1.getReferalsRecords());
        System.out.println(clint1.getReferals());
    }

}
