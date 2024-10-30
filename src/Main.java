import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempt = 0;
        int a = 1 + (int) (Math.random() + 99);
        int hiddenNumber = 0;

        System.out.println("Я загадал число от 1 до 100, как думаешь, что это за число, брат?");

        while (hiddenNumber !=a) {
            hiddenNumber = scanner.nextInt();
            attempt = attempt +1;
            if (hiddenNumber > a) {
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
            } else if (hiddenNumber < a) {
                System.out.println("Я сам в шоке, но, загаданное число больше, брат");
            }
        }
        System.out.println("Поздравляю, брат, ты отгадал число за " + attempt + " попыток!");
    }
}