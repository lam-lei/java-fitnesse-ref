package com.levelup.calculate;

public class Calculator {

    private int number1;
    private int number2;
    private int result;

    public void add()
    {
        this.result = number1 + number2;
    }

    public void setNumber1(int number1)
    {
        this.number1 = number1;
    }

    public void setNumber2(int number2)
    {
        this.number2 = number2;
    }

    public int getResult() {
        return result;
    }

}
