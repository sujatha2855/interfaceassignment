package InterviewQuations;

import java.util.Arrays;

public  class  CheckingTwoStringAreAnagram {
    static String s1="listen";//eilnst
    static String s2= "silent";//eilnst
    public static void main(String[] args) {
        CheckingTwoStringAreAnagram(s1,s2);

    }

    public static void CheckingTwoStringAreAnagram(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        {
            System.out.println(" given strings are not anagram");
        }
        else {
            char str1[] = s1.toCharArray();
            char str2[] = s1.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            if (Arrays.equals(str1,str2)==true)
            {
                System.out.println("the given strings are anagram");
            }
            else
            {
                System.out.println("given strings are not anagram");
            }

        }



    }
}
