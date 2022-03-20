package homework3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Привет, сегодня мы будем делать реверсы!");
        Scanner in = new Scanner(System.in);
        System.out.println("Что хочешь попробовать: \n" +
                "1 - Класический реверс\n" +
                "2 - Реверс без изменения порядка в строке\n" +
                "3 - Реверс по указанной подстроке в строке\n" +
                "4 - Реверс с указанием индекса символа начала и конца\n" +
                "0 - Выйти\n" +
                "Выберите нужныую задачу: ");
        int task = in.nextInt();

        switch (task) {
            case 1: {
                revers1();
            }
            case 2: {
                revers2();
            }
            case 3: {
                revers3();
            }
            case 4: {
                revers4();
            }
            case 0: {
                main(new String[]{""});
            }
        }
    }


    private static void revers1() throws IOException {
        System.out.println("Ты выбрал класический реверс: \n" +
                "1 - Продолжить\n" +
                "0 - Выйти\n" +
                "Выберите нужныую задачу: ");
        Scanner in = new Scanner(System.in);
        int action = in.nextInt();

        switch (action) {
            case 1: {
                Revers revers = new Revers();
                Revers.revers();
            }

            case 0: {
                main(new String[]{""});
            }
        }

    }

    private static void revers2() throws IOException {
        System.out.println("Ты выбрал реверс без изменения порядка в строке: \n" +
                "1 - Продолжить\n" +
                "0 - Выйти\n" +
                "Выберите нужныую задачу: ");
        Scanner in = new Scanner(System.in);
        int action = in.nextInt();

        switch (action) {
            case 1: {
                ReversSecondWay reversSecondWay = new ReversSecondWay();
                ReversSecondWay.reverseWordInMyString();
            }

            case 0: {
                main(new String[]{""});
            }
        }


    }

    private static void revers3() throws IOException {
        System.out.println("Ты выбрал реверс по указанной подстроке в строке: \n" +
                "1 - Продолжить\n" +
                "0 - Выйти\n" +
                "Выберите нужныую задачу: ");
        Scanner in = new Scanner(System.in);
        int action = in.nextInt();

        switch (action) {
            case 1: {
                ReversSubstring reversSubstring = new ReversSubstring();
                ReversSubstring.revers();
            }
            case 0: {
                main(new String[]{""});
            }
        }
    }

    private static void revers4() throws IOException {
        System.out.println("Ты выбрал Pеверс с указанием индекса символа начала и конца: \n" +
                "1 - Продолжить\n" +
                "0 - Выйти\n" +
                "Выберите нужныую задачу: ");
        Scanner in = new Scanner(System.in);
        int action = in.nextInt();

        switch (action) {
            case 1: {
                ReversIndex reversIndex = new ReversIndex();
                System.out.println(ReversIndex.reversIndex());
            }

            case 0: {
                main(new String[]{""});
            }
        }

    }
}

