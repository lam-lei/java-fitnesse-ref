package com.levelup.controller;

import com.levelup.calculate.Calculator;

public class CalculatorController {

    Calculator testObj = new Calculator();

   public int Add(int firstNumber, int secondNumber) {
       testObj.setNumber1(firstNumber);
       testObj.setNumber2(secondNumber);
       testObj.add();
       return testObj.getResult();
   }
}
