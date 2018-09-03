package unittesting;

import org.testng.Assert;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result1 = cal.addition(10, 15);
        Assert.assertEquals(25, result1);
        int result2 = cal.subtraction(100,85);
        Assert.assertEquals(15, result2);
        int result3 = cal.multiplication(10,3);
        Assert.assertEquals(30, result3);


    }
}
