package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol;
        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            symbol = input.charAt(i);
            if (i > 0 && result.charAt(result.length() - 1) == symbol) {
              counter++;
               if (i == input.length() - 1) {
                   result += "" + counter;
               }
            } else {
                result += counter > 1 ? counter + "" + input.charAt(i) : symbol;
                counter = 1;
            }
        }
        return result;
    }
}