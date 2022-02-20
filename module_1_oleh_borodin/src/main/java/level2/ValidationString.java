package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ValidationString {


    private static List<Character> openBrackets = Arrays.asList('(', '[', '{');
    private static List<Character> closedBrackets = Arrays.asList(')', ']', '}');
    private static List<Integer> foundEnclosedBracketIndexes = new ArrayList<>();

    public static String correctString() {
        System.out.println("Пожалуйста, введите строку для проверки, а затем нажмите пробел: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        ;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (isOpenBracket(currentChar) && !isEnclosedPresent(s, i, currentChar)) {
                printError();
                return s;
            }
            if (isClosedBracket(currentChar) && !foundEnclosedBracketIndexes.contains(i)) {
                printError();
                return s;
            }
        }
        System.out.println("Строка написанна коректно и будет выполняться");
        return s;
    }

    public static boolean isEnclosedPresent(String input, int currentIndex, char openBracket) {
        char enclosingBracket = closedBrackets.get(openBrackets.indexOf(openBracket));
        for (int i = currentIndex; i < input.length(); ++i) {
            if (input.charAt(i) == enclosingBracket && !foundEnclosedBracketIndexes.contains(i)) {
                foundEnclosedBracketIndexes.add(i);
                return true;
            }
        }
        return false;
    }

    public static boolean isOpenBracket(char input) {
        for (char ch : openBrackets) {
            if (ch == input) {
                return true;
            }
        }
        return false;
    }

    public static boolean isClosedBracket(char input) {
        for (char ch : closedBrackets) {
            if (ch == input) {
                return true;
            }
        }
        return false;
    }

    public static void printError() {
        System.out.println("Не коректная строка");
    }

}


