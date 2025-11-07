package lr1;

import lr1.InputHelper;

public class task4 {
    public static void main(String[] args) {
        String month = InputHelper.getInputString("Введите название месяца: ");
        int day = InputHelper.getInputInt("Введите количество дней: ");

        System.out.printf("Месяц %s содержит %d дней.", month, day);
    }
}
