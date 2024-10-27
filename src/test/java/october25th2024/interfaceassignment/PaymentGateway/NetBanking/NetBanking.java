package october25th2024.interfaceassignment.PaymentGateway.NetBanking;

import october25th2024.interfaceassignment.PaymentGateway.PaymentGateWay;

public interface NetBanking extends PaymentGateWay {
    NetBanking AccountManagement(String str );
    NetBanking TransactionHistory(double History);
    NetBanking FundsTransfer(double amount );
    NetBanking BillPayments(String str);
    NetBanking MobileCheckDeposits(String str);


    }

