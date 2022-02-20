import level1.AreaTriangleRunner;
import level1.UniqueCountRunner;
import level2.StringRun;
import level3.RunnerGame;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать!");
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите уровень 1-3: ");
        int level = in.nextInt();

        switch (level) {
            case 1: {
                choiceLevelOne();
            }
            case 2: {
                choiceLevelTwo();
            }
            case 3: {
                choiceLevelThree();
            }
        }
    }


    private static void choiceLevelOne() {
        System.out.println("Вы на 1 уровне!");
        System.out.println("Вам доступны следующие задачи: \n" +
                "1 - Поиск уникальных чисел\n" +
                "2 - Ход коня\n" +
                "3 - Площадь треугольника\n" +
                "0 - Выйти\n" +
                "Выберите нужныую задачу: ");
        Scanner in = new Scanner(System.in);
        int task = in.nextInt();

        switch (task) {
            case 1: {
                UniqueCountRunner uniqueCountRunner = new UniqueCountRunner();
                UniqueCountRunner.uniqueCountRunner();
                choiceLevelOne();
            }
            case 2: {
                System.out.println("Ой-йо-йой похоже кто-то украл нашего коня, ох уж эти цыгани, пойду его искать.... ");
                choiceLevelOne();
            }
            case 3: {
                AreaTriangleRunner areaTriangleRunner = new AreaTriangleRunner();
                AreaTriangleRunner.areaTriangleRunner();
                choiceLevelOne();
            }

            case 0: {
                main(new String[]{""});
            }
        }

    }

    private static void choiceLevelTwo() {
        System.out.println("Вы на 2 уровне!");
        System.out.println("Вам доступны следующие задачи: \n" +
                "1 - Проверка на вальдность скобок\n" +
                "0 - Выйти\n" +
                "Выберите нужныую задаччу: ");
        Scanner in = new Scanner(System.in);
        int task = in.nextInt();

        switch (task) {
            case 1: {
                StringRun stringRun = new StringRun();
                StringRun.runString();
            }

            case 0: {
                main(new String[]{""});
            }
        }


    }

    private static void choiceLevelThree() {
        System.out.println("Вы на 3 уровне!");
        System.out.println("Вам доступны следующие задачи: \n" +
                "1 - Игра в жизнь\n" +
                "0 - Выйти\n" +
                "Выберите нужныую задаччу: ");
        Scanner in = new Scanner(System.in);
        int task = in.nextInt();

        switch (task) {
            case 1: {
                RunnerGame runnerGame = new RunnerGame();
                runnerGame.runGame();
            }

            case 0: {
                main(new String[]{""});
            }
        }
    }
}

