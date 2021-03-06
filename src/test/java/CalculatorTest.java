import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(25, 5);
    }
//ideal in a calculator not to initialise numbers in the new calculator. Want to test any numbers, should have the methods take in numbers as parameters.


    @Test
    public void hasNumbers(){
        assertEquals(25, calculator.getNumber1());
    }

    @Test
    public void addsNumbers(){
        assertEquals(30, calculator.addNumbers());
    }

    @Test
    public void subtractsNumbers(){
        assertEquals(20, calculator.subtractNumbers());
    }

    @Test
    public void mulitpliesNumbers(){
        assertEquals(125, calculator.multiplyNumbers());
    }

    @Test
    public void dividesNumbers(){
        assertEquals(5, calculator.divideNumbers());
    }
}
