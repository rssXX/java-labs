package lr1;

import lr1.InputHelper;

public class task2 {
    public static void main(String[] args) {
        String name = InputHelper.getInputString("Введите своё имя: ");
        int age = InputHelper.getInputInt("Введите свой возраст: ");

        System.out.printf("Имя: %s.\nВозраст: %d.", name, age);
    }
}
