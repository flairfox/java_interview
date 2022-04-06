package ru.sberbank.interview;

public class Strings_2 {

    private final static int repeat = 10_000;

    // Чем отличаются данные подходы и какой стоит использовать и когда?

    public static void main(String[] args) {
        stringBuffer();
        stringBuilder();
        stringConcat();
    }


    private static void stringConcat() {
        long start = System.nanoTime();
        String str = "str";
        for (int i = 0; i < repeat; i++) {
            str += i;
        }

        System.out.println("String concatenation: " + (System.nanoTime() - start));
    }

    private static void stringBuilder() {
        long start = System.nanoTime();
        String str = "str";
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < repeat; i++) {
            sb.append(i);
        }

        str = sb.toString();
        System.out.println("String builder: " + (System.nanoTime() - start));
    }

    private static void stringBuffer() {
        long start = System.nanoTime();
        String str = "str";
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < repeat; i++) {
            sb.append(i);
        }

        str = sb.toString();
        System.out.println("String buffer: " + (System.nanoTime() - start));
    }

}