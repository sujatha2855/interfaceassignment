package InterviewQuations;

public class SwapNumbers {

    public static void main(String[] args) {
         int a= 5;
         int b= 15;
        System.out.println(" before swapping a value is " + a);
        System.out.println(" before swapping b value is " + b);
         b= b-a;
         a=b+a;
         b=a-b;

        System.out.println("print a value after swapping " + a);
        System.out.println(" print b value as after swapping  " + b);

    }
}
