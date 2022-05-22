import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);

    int readQuantity() {
        System.out.print("Enter quantity : ");
        return scanner.nextInt();
    }
    String[] array;
    Long[] resultArrayLong;
    Double[] resultArrayDouble;
    int size;

    String readStr() {
        System.out.print("Enter value: ");
        return scanner.next();
    }
    String[] getArrayFromConsole() {
        size = readQuantity();
        array = new String[size];
        return fillArray(array);
    }
    String[] fillArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = readStr();
        }
        return array;
    }
    boolean findDot(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].indexOf('.') > -1) {
                return true;
            }
        }
        return false;
    }
    Long[] resultArrayLong (String[] array) {
        resultArrayLong = new Long[size];
        for (int i = 0; i < array.length; i++){
            resultArrayLong[i] = Long.valueOf(array[i]);
        }
        return resultArrayLong;
    }
    Double[] resultArrayDouble (String[] array) {
        resultArrayDouble = new Double[size];
        for (int i = 0; i < array.length; i++){
            resultArrayDouble[i] = Double.valueOf(array[i]);
        }
        return resultArrayDouble;
    }
}
