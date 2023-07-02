package Homework.New;

import java.util.Random;
public class HomeWork21062023 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(28801); // Генерируем случайное число от 0 до 28800

        System.out.println("Осталось секунд: " + n);
        System.out.println(getRemainingHours(n));
    }

    public static String getRemainingHours(int seconds) {
        int hours = seconds / 3600; // Получаем количество полных часов

        if (hours > 0) {
            return "Осталось " + hours + " часов";
        } else if (seconds >= 3600) {
            return "Остался 1 час";
        } else if (seconds >= 60) {
            return "Осталось менее часа";
        } else {
            return "Рабочий день закончился";
        }
    }
}

