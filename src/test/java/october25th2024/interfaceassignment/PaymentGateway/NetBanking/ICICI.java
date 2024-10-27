package october25th2024.interfaceassignment.PaymentGateway.NetBanking;

import october25th2024.interfaceassignment.PaymentGateway.PaymentGateWay;

public class ICICI implements NetBanking,PaymentGateWay {

    @Override
    public ICICI AccountManagement(String str) {
        System.out.println("AccountManagement in icici bank " + str);
        return this;
    }

    @Override
    public ICICI TransactionHistory(double History) {
        System.out.println(" icici bank TransactionHistory " + History);
        return this;
    }

    @Override
    public ICICI  FundsTransfer(double amount) {
        System.out.println("FundsTransfer in icici bank " + amount);
        return this;
    }

    @Override
    public ICICI BillPayments(String str) {
        System.out.println("BillPayments in icici bank " + str);
        return this;
    }

    @Override
    public ICICI MobileCheckDeposits(String str) {
        System.out.println(" i wil checks MobileCheckDeposits in icici bank " + str);
        return this;
    }

    @Override
    public ICICI displayCardNumber(String str) {
        System.out.println(" enter  ICICI displayCardNumber " + str );
        return this;
    }

    @Override
    public ICICI CardExperidate(double date) {
        System.out.println("ICICI CardExperidate " + date);
        return this;
    }

    @Override
    public ICICI cardholdername(String str) {
        System.out.println(" enter  ICICI cardholdername " + str);
        return this;
    }





}
