package october25th2024.interfaceassignment.PaymentGateway.CreditCard;

import october25th2024.interfaceassignment.PaymentGateway.PaymentGateWay;

public class VISA implements CreditCard,PaymentGateWay {


    @Override
    public VISA CardNumber(double cardnum) {
        System.out.println(" enter Visa card number " + cardnum);
        return this;
    }



    @Override
    public VISA Chip(String str) {
        System.out.println("VISA Chip" + str);
        return this;
    }

    @Override
    public VISA CardVerificationValue(double value) {
        System.out.println("VISA CardVerificationValue" + value);
        return this;
    }

    @Override
    public VISA displayCardNumber(String str) {
        System.out.println("VISA displayCardNumber" + str);
        return this;
    }

    @Override
    public VISA CardExperidate(double date) {
        System.out.println("VISA CardExperidate " + date);
        return this;
    }

    @Override
    public VISA cardholdername(String str) {
        System.out.println("VISA cardholdername" + str);
        return this;
    }



}