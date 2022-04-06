package ru.sberbank.interview;

public class Static_1 {

    // Что выведется в консоль?

    static {
        System.out.println("Я блок static!");
    }

    public static void main(String[] args) {
        System.out.println("Я main-метод!");
    }

    static {
        System.out.println("Я тоже блок static, но я вызываю System.exit(0)");
        System.exit(0);
    }

}
