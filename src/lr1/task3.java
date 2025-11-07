package lr1;

import lr1.InputHelper;

public class task3 {
    public static void main(String[] args) {
        int dayWeek = InputHelper.getInputInt("Введите день недели: ");
        String month = InputHelper.getInputString("Введите название месяца: ");
        int numberDayInMonth = InputHelper.getInputInt("Введите номер дня в месяце: ");

        System.out.printf("Сегодняшняя дата: %d, %s, %d", dayWeek,  month, numberDayInMonth);
    }
}
