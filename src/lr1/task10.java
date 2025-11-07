package lr1;

public class task10 {
    public static void main(String[] args) {
        int a = InputHelper.getInputInt("Введите первое число: ");
        int b = InputHelper.getInputInt("Введите второе число: ");

        System.out.printf("Сумма: %d\nРазность: %d", a + b, a - b);
    }
}
