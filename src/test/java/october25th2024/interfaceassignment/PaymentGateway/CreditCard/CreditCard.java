package october25th2024.interfaceassignment.PaymentGateway.CreditCard;

import october25th2024.interfaceassignment.PaymentGateway.PaymentGateWay;

public interface CreditCard extends PaymentGateWay {

    CreditCard CardNumber(double cardnum);

    CreditCard Chip(String str);
    CreditCard CardVerificationValue(double value);

}
