package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "" + input.charAt(0);
        char symbol;
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            symbol = input.charAt(i);
            if (result.charAt(result.length() - 1) == symbol) {
              counter++;
            } else {
                result += counter > 1 ? counter + "" + input.charAt(i) : symbol;
                counter = 1;
            }
        }
        if (counter > 1) {
            result += "" + counter;
        }
        return result;
    }
}