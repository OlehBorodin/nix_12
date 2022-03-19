package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Revers {
    public static void revers() {
        System.out.println("Введите пожалуйста строку для реверса и нажмите Enter.");
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = line.readLine();
            StringBuilder input1 = new StringBuilder();
            input1.append(input);
            input1.reverse();
            System.out.println(input1);

        } catch (
                IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}
