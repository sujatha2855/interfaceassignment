package october25th2024.interfaceassignment.PaymentGateway.NetBanking;

import october25th2024.interfaceassignment.PaymentGateway.PaymentGateWay;

public class HDFC implements NetBanking,PaymentGateWay{


    @Override
    public HDFC AccountManagement(String str) {
        System.out.println("i will take care of AccountManagement in hdfc bank" + str);
        return this;
    }

    @Override
    public HDFC TransactionHistory(double History) {
        System.out.println(" hdfc bank shows TransactionHistory " + History);
        return this;
    }

    @Override
    public HDFC FundsTransfer(double amount) {
        System.out.println(" enter amount in hdfc bank " + amount);
        return this;
    }

    @Override
    public HDFC BillPayments(String str) {
        System.out.println(" enter  HDFC BillPayments " + str );

        return this;
    }

    @Override
    public HDFC MobileCheckDeposits(String str) {
        System.out.println(" HDFC MobileCheckDeposits" + str);
        return this;
    }

    @Override
    public HDFC displayCardNumber(String str) {
        System.out.println("HDFC displayCardNumber " + str);
        return this;
    }

    @Override
    public HDFC CardExperidate(double date) {
        System.out.println(" HDFC CardExperidate " + date);
        return this;
    }

    @Override
    public  HDFC cardholdername(String str) {
        System.out.println(" HDFC cardholdername  " + str);
        return this;
    }


    public HDFC paymentmethod(double amount) {
        System.out.println("enter amount using hdfc bank" + amount);
        return this;
    }
}
