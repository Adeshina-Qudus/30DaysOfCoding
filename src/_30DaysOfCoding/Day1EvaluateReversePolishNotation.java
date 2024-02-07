package _30DaysOfCoding;

import exception.IllegalOperatorException;

import java.util.ArrayList;
import java.util.Stack;

public class Day1EvaluateReversePolishNotation {


    public static int evaluateReversePolishNotation(String[] tokens) {
        Stack<Integer> integerStack = new Stack<>();
        int result = 0;
        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                integerStack.push(Integer.parseInt(token));
            } else {
                result = conditionToGetResult(token, integerStack);
                integerStack.push(result);
            }
        }
        return result;
    }

    private static int conditionToGetResult(String token, Stack<Integer> integerStack) {
        int result;
        int operand2 = integerStack.pop();
        int operand1 = integerStack.pop();
        result = switch (token) {
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            case "/" -> operand1 / operand2;
            default -> throw new IllegalOperatorException("Invalid token: " + token);
        };
        return result;
    }
}