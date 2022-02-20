package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UniqueCount {

    public static List<Integer> getIntegerList() {
        System.out.println("Введите  через пробел числа с которыми хотите работать, а затем нажмите Ентер : ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        try {

            String inputString = reader.readLine();
            String[] intArray = inputString.split(" ");
            for (String s : intArray) {
                list.add(Integer.parseInt(s));
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        return list;
    }

    public static String uniqueCount() {
        List<Integer> integerList = getIntegerList();
        List<Integer> foundIntegers = new ArrayList<>();

        for (Integer i : integerList) {
            if (!foundIntegers.contains(i)) {
                foundIntegers.add(i);
            }
        }
        return foundIntegers.size() + " количество уникальных символов";
    }
}

