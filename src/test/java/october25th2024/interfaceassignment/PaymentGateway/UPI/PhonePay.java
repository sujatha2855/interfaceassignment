package october25th2024.interfaceassignment.PaymentGateway.UPI;

import october25th2024.interfaceassignment.PaymentGateway.PaymentGateWay;

public class PhonePay implements UPI, PaymentGateWay {

    @Override
    public PhonePay addMobileNumber(String str) {
        System.out.println("adding mobile number in phonepay" + str);
        return this;
    }


    @Override
    public PhonePay cardDetails(String str) {
        System.out.println("entering  card details in phone pay "+ str);
        return this;
    }

    @Override
    public PhonePay accountNumber(String str) {
        System.out.println(" phone pay Account number is "+ str);
        return this;
    }

    @Override
    public PhonePay emailId(String str) {
        System.out.println("  enter your email id in phonepay "+ str);
        return this;
    }


    public PhonePay verifyaccountnumber(String str) {
        System.out.println(" verifyaccountnumber "+ str);
        return this;
    }

    @Override
    public PhonePay paytoAccoutnumber(String str) {
        System.out.println("enter Accoutnumber"+str );
        return this;
    }

    @Override
    public PhonePay paytoPhoneNumber(String str) {
        System.out.println("enter phone number"+ str);
        return this;
    }

    @Override
    public PhonePay paytoContacts(String str) {
        System.out.println("select contacts" + str);
        return this;
    }

    @Override
    public PhonePay displayCardNumber(String str) {
        System.out.println(" i am displayCardNumber method" + str);
        return this;
    }

    @Override
    public PhonePay CardExperidate(double date) {

        System.out.println("enter your cardexperidate" + date);
        return this;
    }

    @Override
    public PhonePay cardholdername(String str) {
        System.out.println("enter cardholdername" +str);
        return this;
    }


    public PhonePay paymentmethod(double amount) {
        System.out.println(" enter amount" + amount);
        return this;
    }
}
