package ru.sberbank.interview;

public class Exceptions_1 {

    public static void main(String[] args) {
        // Что выведется в консоль?
        try {
            int i = 5;
        } catch (Throwable t) {
            System.out.println("Catch!");
        } finally {
            System.out.println("Finally!");
        }
    }

}
