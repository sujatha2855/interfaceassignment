package seleniumselfpractice.interviewquations;

public class MargetwoStringsAlternatively {
    public static void main(String[] args) {

        String a = "jskg";
        String b = "kiop";
        System.out.println( MergestringsAlternativerly(a, b));


    }

    public static String MergestringsAlternativerly(String a, String b) {
        StringBuilder mersged = new StringBuilder();
        int i = 0;
        while (i < a.length() || i < b.length()) {
            if (i < a.length()) {
                mersged.append(a.charAt(i));
            }
            if (i < b.length()) {
                mersged.append(b.charAt(i));
            }
            i++;
        }


        return mersged.toString();

    }
}

