package _30DaysOfCoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day1EvaluateReversePolishNotationTest {


    @Test
    public void test(){
        String [] tokens = {"2","1","+","3","*"};
        int output = 9;
        assertEquals(output,Day1EvaluateReversePolishNotation.evaluateReversePolishNotation(tokens));
    }
    @Test
    public void secondTest(){
        String [] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int output =  22;
        assertEquals(output,Day1EvaluateReversePolishNotation.evaluateReversePolishNotation(tokens));
    }

}