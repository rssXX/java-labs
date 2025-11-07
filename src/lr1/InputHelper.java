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
        return scanner.nextInt();
    }
}
