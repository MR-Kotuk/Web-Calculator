package com.mr_kotuk.WebCalculator.services;

import org.springframework.stereotype.Service;

import com.mr_kotuk.WebCalculator.model.Calculate;

@Service
public class CalculatorService {
    public double calculate(Calculate calculate) {
        double firstNumber = calculate.getFirstNumber();
        double secondNumber = calculate.getSecondNumber();
        String operator = calculate.getOperator();

        switch (operator) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                if (secondNumber == 0)
                    return 0;

                return firstNumber / secondNumber;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}