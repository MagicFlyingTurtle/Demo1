package main.java;

import java.util.Scanner;

public class InputValue {
    Scanner scanner = new Scanner(System.in);
    String readStr() {
        System.out.print("Enter value: ");
        return scanner.next();
    }
}
