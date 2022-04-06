package ru.sberbank.interview;

public class Inheritance_1 {

    public static void main(String[] args) {
        Class0 test = new Class1();
        test.test();
        // Что выведется в консоль?
    }

    private static class Class0 {
        public static void test() {
            System.out.println("Class0::test()");
        }
    }

    private static class Class1 extends Class0 {
        public static void test() {
            System.out.println("Class1::test()");
        }
    }

}
