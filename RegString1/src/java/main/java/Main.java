package main.java;

public class Main {
    public static void main(String[] args) {

        String expression;

        InputValue inputValue = new InputValue();
        expression = inputValue.readStr();

        Arguments arguments = new Arguments();
        System.out.println("Result: " + arguments.sumArguments(expression));
    }
}