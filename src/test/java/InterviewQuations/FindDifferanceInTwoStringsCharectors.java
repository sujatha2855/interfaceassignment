package InterviewQuations;

import java.util.HashSet;

public class FindDifferanceInTwoStringsCharectors {
    public static void main(String[] args) {
        String s1 = "lalitha";
        String s2 = "kavitha";

        System.out.println(FindDifferanceInTwoStringsCharectors(s2, s1));
        System.out.println(FindDifferanceInTwoStringsCharectors(s1, s2));


    }

    public static String FindDifferanceInTwoStringsCharectors(String s1, String s2) {



        HashSet<Character> set1 = new HashSet<>();
       char[] word1= s1.toCharArray();
        for (char c :word1 ) {
            set1.add(c);

        }
        StringBuilder sb = new StringBuilder();
       char [] word2= s2.toCharArray();
        for (char c :word2) {
            if (!set1.contains(c)) {
                sb.append(c);
            }
        }
        return sb.toString();



    }


}
