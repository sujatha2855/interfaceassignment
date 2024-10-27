package october25th2024.interfaceassignment.PaymentGateway.CreditCard;

import october25th2024.interfaceassignment.PaymentGateway.PaymentGateWay;

public class MasterCard implements CreditCard,PaymentGateWay {

    @Override
    public MasterCard CardNumber(double cardnum) {
        System.out.println(" Enter the Mastercard number as " + cardnum);
        return this;
    }




    @Override
    public MasterCard Chip(String str) {
        System.out.println(" MasterCard Chip" +str);
        return this;
    }

    @Override
    public MasterCard CardVerificationValue(double value) {
        System.out.println("MasterCard CardVerificationValue" + value);
        return this;
    }

    @Override
    public MasterCard displayCardNumber(String str) {
        System.out.println(" enter MasterCard displayCardNumber " + str);
        return this;
    }

    @Override
    public MasterCard CardExperidate(double date) {
        System.out.println("MasterCard CardExperidate " + date);
        return this;
    }


    public MasterCard cardholdername(String str) {
        System.out.println(" enter cardholder name " + str);
        return this;
    }



}
