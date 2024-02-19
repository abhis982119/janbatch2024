package org.pbatch.interfacepackage.paymentsystem.helper;

import org.pbatch.interfacepackage.paymentsystem.api.IPayment;

public final class PaymentHelper {

    public static boolean  doPayment(IPayment payment, double amount){
        return payment.doPayment(amount);
    }
}
