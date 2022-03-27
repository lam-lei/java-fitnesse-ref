package com.levelup.calculate.fitnesseFixtures;

import com.levelup.controller.CalculatorController;

public class CalculatorFixture {
    int firstNumber;
    int secondNumber;

    CalculatorController testObj;

    public void setFirstNumber(int firstNumber)
    {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber)
    {
        this.secondNumber = secondNumber;
    }

    public int sum() {
        testObj = new CalculatorController();
        return testObj.Add(firstNumber, secondNumber);
    }
    
}
