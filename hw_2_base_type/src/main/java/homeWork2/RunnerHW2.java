package homeWork2;

import java.util.Scanner;

public class RunnerHW2 {


    public static void main(String[] args) {
        System.out.println("Добро пожаловать!");
        Scanner in = new Scanner(System.in);
        System.out.println("Вам доступны следующие задачи: \n" +
                "1 - Поиск суммы чисел в строке\n" +
                "2 - Поиск количества уникальных символов в строке\n" +
                "3 - Конец урока в школе\n" +
                "0 - Выйти\n" +
                "Выберите нужныую задачу: ");
        int task = in.nextInt();

        switch (task) {
            case 1: {
                numbexExTask();
            }
            case 2: {
                countCharTask();
            }
            case 3: {
                schoolTask();
            }
        }
    }


    private static void schoolTask() {
        System.out.println("Вам доступны следующие возможности: \n" +
                "1 - Начать задачу\n" +
                "0 - Выйти\n" +
                "Выберите нужныую задачу: ");
        Scanner in = new Scanner(System.in);
        int action = in.nextInt();

        switch (action) {
            case 1: {
                School school = new School();
                School.timeFind();
            }

            case 0: {
                main(new String[]{""});
            }
        }

    }

    private static void numbexExTask() {
        System.out.println("Вам доступны следующие возможности: \n" +
                "1 - Начать задачу\n" +
                "0 - Выйти\n" +
                "Выберите нужныую задачу: ");
        Scanner in = new Scanner(System.in);
        int action = in.nextInt();

        switch (action) {
            case 1: {
                NumberEx numberEx = new NumberEx();
                NumberEx.numberAction();
            }

            case 0: {
                main(new String[]{""});
            }
        }


    }

    private static void countCharTask() {
        System.out.println("Вам доступны следующие возможности: \n" +
                "1 - Начать задачу\n" +
                "0 - Выйти\n" +
                "Выберите нужныую задачу: ");
        Scanner in = new Scanner(System.in);
        int action = in.nextInt();

        switch (action) {
            case 1: {
                CountChar countChar = new CountChar();
                CountChar.countChar();
            }

            case 0: {
                main(new String[]{""});
            }
        }
    }
}

