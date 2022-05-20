package string.problems;

public class Palindrome {
    public static void main(String[] args) {


        String s1="dad";
        StringBuffer sb= new StringBuffer(s1);
        String s2=sb.reverse().toString();
        if(s1.equals(s2)) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

    }
}
