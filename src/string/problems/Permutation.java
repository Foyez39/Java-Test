package string.problems;

import java.util.Scanner;

public class Permutation {

    static void printpermutation(String str, String answer) {

        if(str.length()==0) {
            System.out.print(answer + " ");
            return;
        }
        for(int i=0; i<str.length();i++) {
            char ch=str.charAt(i);
            String r=str.substring(0,i)+str.substring(i+1);
            printpermutation(r,answer+ch);
        }

    }


    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter string:");
        String str=input.next();
        printpermutation(str, " ");


        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
    }
}
