package com.mr_kotuk.WebCalculator.services;

import org.springframework.stereotype.Service;

import com.mr_kotuk.WebCalculator.model.Calculate;

@Service
public class CalculatorService {
    public double calculate(Calculate calculate) {
        double firstNumber = calculate.getFirstNumber();
        double secondNumber = calculate.getSecondNumber();
        double result = 0;

        switch (calculate.getOperator()) {
            case "+" -> result = firstNumber + secondNumber;
            case "-" -> result = firstNumber - secondNumber;
            case "*" -> result = firstNumber * secondNumber;
            case "/" -> result = secondNumber == 0 ? -1 : firstNumber / secondNumber;
            default -> throw new IllegalArgumentException("Invalid operator");
        }

        return result;
    }
}