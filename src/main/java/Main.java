import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] inputArrayString;
        Number resultAdd, resultSub, resultMult, resultDiv;

        Console console = new Console();
        inputArrayString = console.getArrayFromConsole();

        Calculator calculator = new Calculator();
        if (console.findDot(inputArrayString)) {
            resultAdd = calculator.addition(console.resultArrayDouble(inputArrayString));

            Double[] arguments = console.resultArrayDouble(inputArrayString);

            resultSub = calculator.subtraction(arguments[0], arguments[1]);
            resultMult = calculator.multiplication(arguments[0], arguments[1]);
            resultDiv = calculator.division(arguments[0], arguments[1]);
        }
        else {
            resultAdd = calculator.addition(console.resultArrayLong(inputArrayString));

            Long[] arguments = console.resultArrayLong(inputArrayString);

            resultSub = calculator.subtraction(arguments[0], arguments[1]);
            resultMult = calculator.multiplication(arguments[0], arguments[1]);
            resultDiv = calculator.division(arguments[0], arguments[1]);
        }

        System.out.println("Addition result: " + new DecimalFormat("0.####").format(resultAdd));
        System.out.println("Subtraction result (only the first 2 values): " + new DecimalFormat("0.####").format(resultSub));
        System.out.println("Multiplication result (only the first 2 values): " + new DecimalFormat("0.####").format(resultMult));
        System.out.println("Division result (only the first 2 values): " + new DecimalFormat("0.####").format(resultDiv));
    }
}
