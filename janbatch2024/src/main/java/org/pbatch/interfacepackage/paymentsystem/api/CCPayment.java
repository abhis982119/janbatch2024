package org.pbatch.interfacepackage.paymentsystem.api;

import org.pbatch.interfacepackage.paymentsystem.api.IPayment;

import java.sql.SQLOutput;

public abstract class CCPayment implements IPayment {

    public void getCCDetails(){
        System.out.println("fetch cc details");
    }

    public final  boolean doPayment(double amount){
        getCCDetails();
        redictUserToGateway();
        return readGatewayResponse();
    }


    public abstract void redictUserToGateway();


    public abstract boolean readGatewayResponse();

}
