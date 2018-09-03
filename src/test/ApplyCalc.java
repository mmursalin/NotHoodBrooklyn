package test;

import org.testng.Assert;

public class ApplyCalc {

    public static  void main(String [] args){
        Calculator cal = new Calculator();
        Assert.assertEquals(cal.addition(10,15), 25);
        Assert.assertEquals(cal.subtraction(20,10), 10);
        Assert.assertEquals(cal.multiplication(10,10), 100);

    }
}

