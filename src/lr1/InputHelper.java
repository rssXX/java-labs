package lr1;

import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in, "Cp866");

    public static String getInputString(String quest) {
        System.out.print(quest);
        return scanner.nextLine();
    }

    public static int getInputInt(String quest) {
        System.out.print(quest);
        while (!scanner.hasNextInt()) {
            System.out.print("Введите целое число: ");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
}
