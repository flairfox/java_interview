package ru.sberbank.interview;

public class Strings_1 {

    public static void main(String[] args) {
        // Чем отличаются такие способы создания строк?
        String s1 = "string_1";
        String s2 = "string_2";
        String s3 = new String("string_1");

        // Что выведется в консоль?
        System.out.println(s1 == s3);
    }

}
