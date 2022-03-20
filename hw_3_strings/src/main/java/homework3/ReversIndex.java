package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversIndex {
    public static String reversIndex() throws IOException {
        System.out.println("Введите пожалуйста строку для реверса и нажмите Enter.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        String str = reader.readLine();

        System.out.println("Введите первый индекс");
        int index1 = 0;
        index1 = Integer.parseInt(reader.readLine());


        System.out.println("Ввдедите второй индекс");
        int index2 = 0;
        index2 = Integer.parseInt(reader.readLine());


        String string = "";
        String subString = str.substring(index1, index2);
        for (int i = subString.length() - 1; i >= 0; i--) {
            string += subString.charAt(i);

        }
        return str.replaceAll(subString, string);
    }
}

