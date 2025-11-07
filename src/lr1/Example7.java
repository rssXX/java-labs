package lr1;

public class Example7 {
    public static void main(String[] args) {
        String name = InputHelper.getInputString("Введите своё имя: ");
        int age = InputHelper.getInputInt("Введите свой возраст: ");

        System.out.printf("Имя: %s.\nВозраст: %d.", name, age);
    }
}
