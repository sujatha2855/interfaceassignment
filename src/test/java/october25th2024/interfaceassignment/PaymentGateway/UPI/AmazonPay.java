package october25th2024.interfaceassignment.PaymentGateway.UPI;

import october25th2024.interfaceassignment.PaymentGateway.PaymentGateWay;

public class AmazonPay implements PaymentGateWay,UPI {


    @Override
    public AmazonPay addMobileNumber(String str) {
        System.out.println("addMobileNumber in AmazonPay" + str);
        return this;
    }


    @Override
    public AmazonPay cardDetails(String str) {
        System.out.println(" enter card details in amazonpay" + str);
        return this;
    }

    @Override
    public AmazonPay accountNumber(String str) {
        System.out.println(" enter account number is " + str);
        return this;
    }

    @Override
    public AmazonPay emailId(String str) {
        System.out.println(" enter email id " + str);
        return this;
    }

    @Override
    public AmazonPay paytoAccoutnumber(String str) {
        System.out.println("enter account number" + str);
        return this;
    }

    @Override
    public AmazonPay paytoPhoneNumber(String str) {
        System.out.println(" enter phone number" + str);
        return this;
    }

    @Override
    public AmazonPay paytoContacts(String str) {
        System.out.println(" select contacts" + str);
        return this;
    }

    @Override
    public AmazonPay displayCardNumber(String str) {
        System.out.println("  displayCardNumber" + str);
        return this;
    }

    @Override
    public AmazonPay CardExperidate(double date) {
        System.out.println("AmazonPay CardExperidate" + date);
        return this;
    }

    @Override
    public AmazonPay cardholdername(String str) {
        System.out.println("AmazonPay cardholdername"+ str);
        return this;
    }


    public AmazonPay paymentmethod(double amount) {
        System.out.println(" enter the amount in amazonpay" + amount);
        return this;
    }
}
