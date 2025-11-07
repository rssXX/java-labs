import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

void main() throws UnsupportedEncodingException {
    System.setOut(new PrintStream(System.out, true, "Cp866"));
    Scanner in = new Scanner(System.in, "Cp866");

    System.out.print("Введите свою фамилию: ");
    String surname = in.nextLine();

    System.out.print("Введите свою имя: ");
    String name = in.nextLine();

    System.out.print("Введите свою отчество: ");
    String patronymic = in.nextLine();

    System.out.printf("Hello %s %s %s", surname, name, patronymic);
    in.close();
}