package october25th2024.interfaceassignment.PaymentGateway.UPI;

import october25th2024.interfaceassignment.PaymentGateway.PaymentGateWay;

public class Gpay implements UPI, PaymentGateWay {
    @Override
    public Gpay addMobileNumber(String str) {
        System.out.println("add mobile number in gpay" + str);
        return this;
    }


    @Override
    public Gpay cardDetails(String str) {
        System.out.println("using gpay printing card details as " +str);
        return this;
    }

    @Override
    public Gpay accountNumber(String str)
    {
        System.out.println("entering card number as " + str);
        return this;
    }

    @Override
    public Gpay emailId(String str) {
        System.out.println("enter your email id "+ str);
        return this;
    }


    public Gpay verifyaccountnumber(String str) {
        System.out.println("enter your account number "+str);
        return this;
    }

    @Override
    public Gpay paytoAccoutnumber(String str) {
        System.out.println("enter account number which you pay "+str);
        return this;
    }

    @Override
    public Gpay paytoPhoneNumber(String str) {
        System.out.println("Enter phone number "+ str);
        return this;
    }

    @Override
    public Gpay paytoContacts(String str) {
        System.out.println("Select the contacts from your phone"+ str);
        return this;
    }


    @Override
    public Gpay displayCardNumber(String str) {
        System.out.println(" Gpay displayCardNumber" + str);
        return this;
    }

    @Override
    public Gpay CardExperidate(double date) {
        System.out.println("enter cardexperidate "+ date);
        return this;
    }

    @Override
    public Gpay cardholdername(String str) {
        System.out.println("cardholdername is " + str);
        return this;
    }


    public Gpay paymentmethod(double amount) {
        System.out.println("enter amount to pay" + amount);
        return this;
    }
}
