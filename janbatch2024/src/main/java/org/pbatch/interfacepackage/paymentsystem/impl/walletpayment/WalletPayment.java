package org.pbatch.interfacepackage.paymentsystem.impl.walletpayment;

import org.pbatch.interfacepackage.paymentsystem.api.IPayment;

public abstract class WalletPayment implements IPayment {


    public abstract  void redirectToApp();

    public abstract  boolean responseFromWalletApp();

    public final boolean  doPayment(double amount){
        redirectToApp();
        return responseFromWalletApp();
    }

}
