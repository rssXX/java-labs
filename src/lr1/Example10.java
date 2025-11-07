package lr1;

import java.time.Year;

public class Example10 {
    public static void main(String[] args) {
        int birthdayYear = InputHelper.getInputInt("Введите год рождения: ");
        int year = Year.now().getValue();

        System.out.printf("Вам возраст: %d", year - birthdayYear);
    }
}
