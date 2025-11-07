package lr1;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Example1 {
    public static String getInput(Scanner scanner, String quest) {
        System.out.print(quest);
        return scanner.nextLine();
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "Cp866"));
        Scanner in = new Scanner(System.in, "Cp866");

        String surname = getInput(in, "Введите свою фамилию: ");
        String name = getInput(in, "Введите своё имя: ");
        String patronymic = getInput(in, "Введите своё отчество: ");

        System.out.printf("Hello %s %s %s", surname, name, patronymic);
        in.close();
    }
}