package seleniumselfpractice.interviewquations;

public class VowelsAndCosonentsInString {
    public static void main(String[] args) {
        String str="iam learning java";
        int vcount=0;
        int ccount=0;
        int charcout=0;
        for(int i=0;i<str.length();i++)
        {

            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                vcount++;
            }
            else
            {
               if(str.charAt(i)!=' ' )
                ccount++;
            }
        }
        System.out.println("number of vowels in string is"+vcount);
        System.out.println("number of consonents in string is"+ccount);




    }


}
