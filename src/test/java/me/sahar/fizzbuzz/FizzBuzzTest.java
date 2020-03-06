package me.sahar.fizzbuzz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public  void fizzBuzzConvertorLeavesNormalNumbersAlone() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        Assert.assertEquals("1" , fizzBuzz.convert(1));
        Assert.assertEquals("2" , fizzBuzz.convert(2));
    }
}
