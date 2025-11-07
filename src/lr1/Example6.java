package lr1;

public class Example6 {
    public static void main(String[] args) {
        String surname = InputHelper.getInputString("Введите свою фамилию: ");
        String name = InputHelper.getInputString("Введите своё имя: ");
        String patronymic = InputHelper.getInputString("Введите своё отчество: ");

        System.out.printf("Hello %s %s %s", surname, name, patronymic);
    }
}