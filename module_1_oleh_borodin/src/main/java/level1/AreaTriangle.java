package level1;

import java.util.Scanner;

public class AreaTriangle {
    public static String areaTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Для поиска площади треугольника по координатам выполните следующие указания: ");

        System.out.println("Введите координату х1 точки А: ");
        double x1 = scanner.nextDouble();
        System.out.println("Введите координату у1 точки А: ");
        double y1 = scanner.nextDouble();
        System.out.println("Введите координату x2 точки B: ");
        double x2 = scanner.nextDouble();
        System.out.println("Введите координату у2 точки B: ");
        double y2 = scanner.nextDouble();
        System.out.println("Введите координату x3 точки C: ");
        double x3 = scanner.nextDouble();
        System.out.println("Введите координату у3 точки C: ");
        double y3 = scanner.nextDouble();
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double square = 0.0;
        if (a + b <= c || a + c <= b || a + c <= b)
            System.out.println("Треугольник не существует");
        else {
            double p = (a + b + c) / 2.0;
            square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return square + " Плащать треугольника";
    }
}
