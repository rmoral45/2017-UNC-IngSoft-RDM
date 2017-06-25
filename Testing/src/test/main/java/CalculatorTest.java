package main.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    @Test
    public void calculator(){
        Calculator calc = new Calculator();
        assertEquals("4+4 debe ser:", 8, calc.suma(4,4));


    }
}
