package lr1;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "Cp866"));
        Scanner in = new Scanner(System.in, "Cp866");

        System.out.print("Введите своё имя: ");
        String name = in.nextLine();

        System.out.print("Введите свой возраст: ");
        int age = in.nextInt();

        System.out.printf("Имя: %s. Возраст: %d.", name, age);
    }
}
