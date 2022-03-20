package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversSecondWay {

    public static void reverseWordInMyString() throws IOException {
        //https://www.javatpoint.com/java-program-to-reverse-each-word-in-string
        System.out.println("Введите пожалуйста строку для реверса и нажмите Enter.");
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        String str = line.readLine();
        String[] words = str.split(" ");
        String reversedString = "";
        StringBuilder reversedStringSB = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder reversedWordSB = new StringBuilder();
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWordSB.append(word.charAt(j));
            }
            String reverseWord = reversedWordSB.toString();
            reversedStringSB.append(reverseWord).append(" ");
        }
        reversedString = reversedStringSB.toString();
        System.out.println(reversedString);
    }

}
