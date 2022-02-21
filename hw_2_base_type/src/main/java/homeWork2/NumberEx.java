package homeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberEx {
    public static void numberAction() {


        System.out.println("Введите пожалуйста строку содержащую цифры и нажмите Enter.");
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        try {
            //https://www.cyberforum.ru/java-j2se/thread1748927.html
            String str = line.readLine();
            char[] chars = str.toCharArray();
            int sum = 0;
            for (int i = 0; i < chars.length; i++) {
                if ((byte) chars[i] >= 0x30 && (byte) chars[i] <= 0x39)
                    sum += (byte) chars[i] - 0x30;
            }
            System.out.println("Сумма введенных чисел  " + sum);
        } catch (
                IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}