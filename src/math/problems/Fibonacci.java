package math.problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("How many numbers : ");
        int response=scan.nextInt();

        int first=0;
        int second=1;
        int fibo;

        System.out.println(" "+first);
        System.out.println(" "+second);

        for(int i=3; i<=response; i++) {

            fibo=first+second;
            System.out.println(" "+fibo);
            first=second;
            second=fibo;
        }


         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */


    }
}
