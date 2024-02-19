package org.pbatch.interfacepackage.flightteam;

import org.pbatch.interfacepackage.paymentsystem.helper.PaymentHelper;
import org.pbatch.interfacepackage.paymentsystem.api.CCPayment;
import org.pbatch.interfacepackage.paymentsystem.impl.ccpayment.BCACCPayment;
import org.pbatch.interfacepackage.paymentsystem.impl.ccpayment.WorldCCPayment;

public class Runner {

    public static void main(String[] args) {
        double ticketAmount = 200;

      //  WorldCCPayment worldCCPayment = new WorldCCPayment();
        BCACCPayment bcaccPayment = new BCACCPayment();
        if(PaymentHelper.doPayment(bcaccPayment , ticketAmount)){
            System.out.println("Payment successful, tickets successfully booked");
        }else{
            System.out.println("Payment failed, please try again with 2 mins.");
        }
    }
}
