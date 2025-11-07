package lr1;

import java.time.Year;

public class Example11 {
    public static void main(String[] args) {
        String name = InputHelper.getInputString("Введите своё имя: ");
        int birthdayYear = InputHelper.getInputInt("Введите год рождения: ");
        int year = Year.now().getValue();

        System.out.printf("%s возраст: %d", name, year - birthdayYear);
    }
}
