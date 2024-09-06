package com.example.quaternarycalculator;

public class logic {

    // Converts a quaternary string to an integer
    public int quaternaryToDecimal(String quaternary) {
        return Integer.parseInt(quaternary, 4);
    }

    // Converts an integer to a quaternary string
    public String decimalToQuaternary(int decimal) {
        return Integer.toString(decimal, 4);
    }

    // Perform addition in quaternary
    public String add(String num1, String num2) {
        int dec1 = quaternaryToDecimal(num1);
        int dec2 = quaternaryToDecimal(num2);
        int result = dec1 + dec2;
        return decimalToQuaternary(result);
    }

    // Perform subtraction in quaternary
    public String subtract(String num1, String num2) {
        int dec1 = quaternaryToDecimal(num1);
        int dec2 = quaternaryToDecimal(num2);
        int result = dec1 - dec2;
        return decimalToQuaternary(result);
    }

    // Perform multiplication in quaternary
    public String multiply(String num1, String num2) {
        int dec1 = quaternaryToDecimal(num1);
        int dec2 = quaternaryToDecimal(num2);
        int result = dec1 * dec2;
        return decimalToQuaternary(result);
    }

    // Perform division in quaternary
    public String divide(String num1, String num2) throws ArithmeticException {
        int dec1 = quaternaryToDecimal(num1);
        int dec2 = quaternaryToDecimal(num2);
        if (dec2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        int result = dec1 / dec2;
        return decimalToQuaternary(result);
    }

    public String squareRoot(String quaternary) {
        int decimal = quaternaryToDecimal(quaternary);  // Convert to decimal
        int sqrtResult = (int) Math.sqrt(decimal);      // Take square root and truncate to integer
        return decimalToQuaternary(sqrtResult);         // Convert back to quaternary
    }

    public String square(String base) {
        int baseDecimal = quaternaryToDecimal(base);           // Convert base to decimal
        int result = (int) Math.pow(baseDecimal, 2);  // Perform exponentiation
        return decimalToQuaternary(result);                    // Convert back to quaternary
    }
}