package com.company;

public class Main {

    public static void main(String[] args) {
        double firstValue = 0;
        double secondValue;
        double answer;

        // initialize variable
        firstValue = 22;
        secondValue = 7;
        String operator = "-";

        System.out.println(doArithmetic(firstValue, secondValue, operator));
        System.out.println(findMaximum(firstValue, secondValue));
        System.out.println(findMinimum(firstValue, secondValue));
    }

    public static double doArithmetic(double firstNumber, double secondNumber, String operator) {
        double answer = 0;
        switch (operator) {
            case "+":
                answer = firstNumber + secondNumber;
               return answer;
            case "-":
                answer = firstNumber - secondNumber;
                return answer;
            case "*":
                answer = firstNumber * secondNumber;
                return answer;
            case "/":
                answer = firstNumber / secondNumber;
                return answer;
            default:
                System.out.println("Enter a valid operator");
                break;
        }
        return answer;
    }

    public static double findMaximum(double firstNumber, double secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }

    public static double findMinimum(double firstNumber, double secondNumber) {
        return Math.min(firstNumber, secondNumber);
    }

}
