package com.kostakov.core.calculator;

import java.util.Enumeration;
import java.util.function.*;

public class Calculator {
    static  Supplier <Calculator> instance = Calculator::new;

    BinaryOperator<Integer> sum = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> intDivide = (x, y) -> /*(Integer)*/ x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> (x >= 0) ? x : x * -1;

    Predicate<Integer> isPositive = x -> x >= 0;

    Consumer<Integer> printInt = System.out::println;
    Consumer<Boolean> printBoolean = System.out::println;

}
