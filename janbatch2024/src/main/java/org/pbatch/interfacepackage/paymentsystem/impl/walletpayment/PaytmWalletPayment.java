package org.pbatch.interfacepackage.paymentsystem.impl.walletpayment;

public class PaytmWalletPayment extends  WalletPayment{
    @Override
    public void redirectToApp() {

    }

    @Override
    public boolean responseFromWalletApp() {
        return false;
    }
}
