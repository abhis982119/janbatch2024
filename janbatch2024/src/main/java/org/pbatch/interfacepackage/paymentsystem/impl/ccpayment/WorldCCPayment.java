package org.pbatch.interfacepackage.paymentsystem.impl.ccpayment;

import org.pbatch.interfacepackage.paymentsystem.api.CCPayment;

public class WorldCCPayment extends CCPayment {


    @Override
    public void redictUserToGateway() {
        System.out.println("redirecting to worldpay gateway ");
    }

    @Override
    public boolean readGatewayResponse() {
        System.out.println("worldpay gateway response received successful");
        return true;
    }


}
