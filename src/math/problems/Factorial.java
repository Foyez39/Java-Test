package math.problems;

import java.sql.SQLOutput;

public class Factorial {
    public  int fact(int n) {
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }

    public static void main(String[] args) {

        Factorial obj=new Factorial();
        int output =obj.fact(5);

        System.out.println("The factorial of 5 is :"+" "+output);


        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

    }
}
