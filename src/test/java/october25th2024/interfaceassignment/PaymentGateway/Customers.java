package october25th2024.interfaceassignment.PaymentGateway;

import october25th2024.interfaceassignment.PaymentGateway.CreditCard.CreditCard;
import october25th2024.interfaceassignment.PaymentGateway.CreditCard.MasterCard;
import october25th2024.interfaceassignment.PaymentGateway.CreditCard.VISA;
import october25th2024.interfaceassignment.PaymentGateway.NetBanking.HDFC;
import october25th2024.interfaceassignment.PaymentGateway.NetBanking.ICICI;
import october25th2024.interfaceassignment.PaymentGateway.NetBanking.NetBanking;
import october25th2024.interfaceassignment.PaymentGateway.UPI.AmazonPay;
import october25th2024.interfaceassignment.PaymentGateway.UPI.Gpay;
import october25th2024.interfaceassignment.PaymentGateway.UPI.PhonePay;
import october25th2024.interfaceassignment.PaymentGateway.UPI.UPI;

public class Customers  {

    public static void main(String[] args) {
        UPI u1=new Gpay();


        u1.cardholdername("tanvi").CardExperidate(12.0).displayCardNumber("123456987");
        UPI u2=new PhonePay();
        u2.accountNumber("12345678").addMobileNumber("9740201463").cardDetails("carddetails").
                cardholdername("tanvi").CardExperidate(12.00).displayCardNumber(" 7654328");
        UPI u3=new AmazonPay();
        u3.addMobileNumber("9740201463").accountNumber("4950701463").cardDetails("carddetails")
                .emailId("sujatha2855@gmail.com").paytoContacts("dad").paytoPhoneNumber("9742501463");
        CreditCard c1= new VISA();
        c1.CardVerificationValue(125.00).Chip("am chip").displayCardNumber("12345678").
                cardholdername("tanvi");

        CreditCard c2= new MasterCard();
        c2.CardVerificationValue(12.0).CardNumber(12365478.0).Chip("am chip").CardVerificationValue(123.00);
        NetBanking n1=new HDFC();
        n1.AccountManagement("show Accountmanagement details").FundsTransfer(500000.0).TransactionHistory(250000.0);
       NetBanking n2= new ICICI();
       n2.MobileCheckDeposits("show MobileCheckDeposits").BillPayments("show bill payments");





        }





    }

