package com.brundage.calculator;
import org.springframework.stereotype.Service;
@Service
public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
    public int product(int a, int b) {
        return a * b;
    }
    public int difference(int a, int b) {
        return a - b;
    }

}