package com.kostakov.core.calculator;

public class Main {

    public static void main(String[] args) {
	Calculator calculator = Calculator.instance.get();

	calculator.printInt.accept(calculator.sum.apply(2, 4));
	calculator.printInt.accept(calculator.minus.apply(8,2));
	calculator.printInt.accept(calculator.intDivide.apply(32,5));
	calculator.printInt.accept(calculator.multiply.apply(3,2));

	calculator.printInt.accept(calculator.pow.apply(6));
	calculator.printInt.accept(calculator.abs.apply(-6));

	calculator.printBoolean.accept(calculator.isPositive.test(-2));


    }
}