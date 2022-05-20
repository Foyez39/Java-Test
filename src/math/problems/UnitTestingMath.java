package math.problems;



import org.junit.Assert;
import org.junit.Test;


public class UnitTestingMath {
// public static void main(String[] args) {
//Apply Unit testing into each classes and methods in this package.
// Factorial fact = new Factorial();

    @Test
    public void factorialFiveShouldBeOneTwenty(){
       // Factorial obj = new Factorial();
        int expected= 120;
        Assert.assertEquals(expected,Factorial.fact(5));

    }

}