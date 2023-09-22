package ru.job4j;

public class Multiple {
    public static void main(String[] args) {
       Multiple multiple = new Multiple();
       multiple.multiple();
    }

    public void multiple() {
        for (int i = 0; i < 9; i++) {
            System.out.println("1 * " + i + " = " + i);
        }
    }
}
