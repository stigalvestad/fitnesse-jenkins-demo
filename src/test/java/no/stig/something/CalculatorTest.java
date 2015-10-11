package no.stig.something;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testPlus() {
        double product = calculator.plus(1, 3);
        assertThat(product, equalTo(4d));
    }

    @Test
    public void testMinus() {

    }
}