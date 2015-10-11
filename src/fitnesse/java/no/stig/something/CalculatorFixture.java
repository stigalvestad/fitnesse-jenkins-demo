package no.stig.something;

import fit.Fixture;

public class CalculatorFixture extends Fixture {

    private Calculator calculator;

    public void start(){
        calculator = new Calculator();
    }

    public double add(int a, int b){
        return calculator.plus(a, b);
    }

}
