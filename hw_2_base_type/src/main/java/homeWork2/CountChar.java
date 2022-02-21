package homeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountChar {

    public static void countChar() {
        System.out.println("Введите пожалуйста строку для подсчета символов и нажмите Enter.");
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        try {
            //https://www.geeksforgeeks.org/print-characters-frequencies-order-occurrence/
            String str = line.readLine();
            printCharWithFreq(str);
        } catch (
                IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }

    static final int SIZE = 26;

    static void printCharWithFreq(String str) {
        int n = str.length();


        int[] freq = new int[SIZE];

        for (int i = 0; i < n; i++)
            freq[str.charAt(i) - 'a']++;


        for (int i = 0; i < n; i++) {


            if (freq[str.charAt(i) - 'a'] != 0) {

                System.out.print(str.charAt(i));
                System.out.print(freq[str.charAt(i) - 'a'] + " ");

                freq[str.charAt(i) - 'a'] = 0;
            }
        }
    }


}
