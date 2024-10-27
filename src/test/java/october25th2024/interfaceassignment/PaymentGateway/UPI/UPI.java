package october25th2024.interfaceassignment.PaymentGateway.UPI;

import october25th2024.interfaceassignment.PaymentGateway.PaymentGateWay;

public interface UPI extends PaymentGateWay {

    UPI addMobileNumber(String str);
    UPI cardDetails(String str);
    UPI accountNumber(String str);
    UPI emailId(String str);

    UPI paytoAccoutnumber(String str);
    UPI paytoPhoneNumber(String str);
    UPI paytoContacts(String str);


}
