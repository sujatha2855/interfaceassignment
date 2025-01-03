package seleniumselfpractice.interviewquations;

public class FirstandLstwordsinString {
    public static void main(String[] args) {

        String s="this is java coding class";
int firstspace=s.indexOf(' ');
int lastspace=s.lastIndexOf( ' ');
String firstword=s.substring(0,firstspace);
String lastword=s.substring(lastspace+1);
        System.out.println("first word in the given string is"+"   "+firstword);
        System.out.println("last word in the given string is"+"  "+lastword);



    }
}
