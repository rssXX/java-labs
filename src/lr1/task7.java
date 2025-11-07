package lr1;

import java.time.Year;

public class task7 {
    public static void main(String[] args) {
        int age = InputHelper.getInputInt("Введите свой возраст: ");
        int year = Year.now().getValue();

        System.out.printf("Вы %d года рождения.", year - age);
    }
}
