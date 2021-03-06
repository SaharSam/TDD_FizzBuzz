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

    @Test
    public  void fizzBuzzConvertorMultiplesOfThree() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        Assert.assertEquals("Fizz" , fizzBuzz.convert(3));
    }

    @Test
    public  void fizzBuzzConvertorMultiplesOfFive() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        Assert.assertEquals("Buzz" , fizzBuzz.convert(5));
    }

    @Test
    public  void multiplesOfBothThreeAndFive() {
        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
        Assert.assertEquals("FizzBuzz" , fizzBuzz.convert(15));
    }
}
