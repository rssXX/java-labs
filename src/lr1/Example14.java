package lr1;

public class Example14 {
    public static void main(String[] args) {
        int num = InputHelper.getInputInt("Введите число: ");

        int prev = num - 1;
        int next = num + 1;
        int sqrt = (int) Math.pow(prev + num + next, 2);

        System.out.println("Последовательность: " + prev + ' ' + num + ' ' + next + ' ' + sqrt);
    }
}
