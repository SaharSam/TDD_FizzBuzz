package me.sahar.fizzbuzz;

import org.junit.jupiter.api.Test;
import me.sahar.fizzbuzz.FizzBuzzConvertor;

public class ActualFizzBuzzAppTest {

    @Test
    public void outputTheHundredFizzBuzzes(){

        FizzBuzzConvertor fizzBuzz = new FizzBuzzConvertor();
       for (int i=1; i<=100; i++)
       {
           System.out.println(fizzBuzz.convert(i));
       }
    }
}
