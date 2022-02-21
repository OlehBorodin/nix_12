package homeWork2;

import java.util.Scanner;

public class School {

    public static int timeFind() {

        System.out.println("Введите урок: ");
        Scanner scanner = new Scanner(System.in);
        int lesson = scanner.nextInt();
        int time;
        time = lesson * 45 + (lesson / 2) * 5 + ((lesson + 1) / 2 - 1) * 15;
        System.out.println("Урок " + lesson + " закончиться " + (time / 60 + 9) + " :" + time % 60);
        return time;
    }
}
