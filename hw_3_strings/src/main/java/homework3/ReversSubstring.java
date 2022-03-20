package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversSubstring {


    public static String revers() throws IOException {
        System.out.println("Введите пожалуйста строку для реверса и нажмите Enter.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        System.out.println("Введите подстроку");
        String subString = reader.readLine();
        String string = "";
        for (int i = subString.length() - 1; i >= 0; i--) {
            string += subString.charAt(i);
        }
        System.out.println(str.replaceAll(subString, string));
        return  str.replaceAll(subString, string);
    }
}


