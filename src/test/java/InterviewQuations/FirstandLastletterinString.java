package InterviewQuations;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FirstandLastletterinString {
    public static void FirstandLastletter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String");
        String original =sc.nextLine();
        int latter =original.length();


     char Firstcharector  =original.charAt(0);
     char Lastcharector =original.charAt(latter-1);

        System.out.println(Firstcharector);
        System.out.println(Lastcharector);



    }

    public static void main(String[] args) {


        FirstandLastletter();
    }
}
