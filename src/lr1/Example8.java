package lr1;

public class Example8 {
    public static void main(String[] args) {
        int dayWeek = InputHelper.getInputInt("Введите день недели: ");
        String month = InputHelper.getInputString("Введите название месяца: ");
        int numberDayInMonth = InputHelper.getInputInt("Введите номер дня в месяце: ");

        System.out.printf("Сегодняшняя дата: %d, %s, %d", dayWeek,  month, numberDayInMonth);
    }
}
