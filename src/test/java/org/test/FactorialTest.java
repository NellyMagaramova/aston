package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    private final Factorial factorial = new Factorial(); ;

    @Test
    public void test1(){
        int result = factorial.getFactorial(5);
        Assert.assertEquals(result, 120);
    }

    @Test
    public void test2(){
        int result = factorial.getFactorial(5);
        Assert.assertNotEquals (result, 121);
    }
}
