import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = console.nextInt();

        int[] inputArray = new int[size];
        int Quantity = 0;
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("Enter value: ");
            inputArray[i] = console.nextInt();
            if (inputArray[i] > 0) {
                Quantity = Quantity + 1;
            }
        }
        int ii = 0;
        int[] resultArray = new int[Quantity];
        for (int j = 0; j < inputArray.length; j++) {
            if (inputArray[j] > 0) {
                resultArray[ii] = inputArray[j];
                ii = ii + 1;
            }
        }
        for (int x : resultArray) {
            System.out.print("[" + x + "] ");
        }
        System.out.println();
        }
    }