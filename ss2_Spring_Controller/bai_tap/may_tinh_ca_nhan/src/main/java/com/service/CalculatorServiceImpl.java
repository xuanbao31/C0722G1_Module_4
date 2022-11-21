package com.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService {

    @Override
    public String calculator(String number1, String number2, String operator) {
        try {
            double result = 0;
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            switch (operator) {
                case "addition":
                    result = num1 + num2;
                    break;
                case "subtraction":
                    result = num1 - num2;
                    break;
                case "multiplication":
                    result = num1 * num2;
                    break;
                case "division":
                    if (num2 == 0) {
                        return "Cannot be divided by 0 !!!";
                    } else {
                        result = num1 / num2;
                        break;
                    }
            }
            return String.valueOf(result);
        } catch (NumberFormatException e) {
            return "Please enter your number";
        }

    }
}
