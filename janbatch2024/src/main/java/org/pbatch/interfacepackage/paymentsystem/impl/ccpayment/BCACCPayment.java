package org.pbatch.interfacepackage.paymentsystem.impl.ccpayment;

import org.pbatch.interfacepackage.paymentsystem.api.CCPayment;

public class BCACCPayment extends CCPayment {
    @Override
    public void redictUserToGateway() {
        System.out.println("redirect to BCA payment gateway ");
    }

    @Override
    public boolean readGatewayResponse() {
        System.out.println("payment successful from bca payment gateway");
        return true;
    }
}
