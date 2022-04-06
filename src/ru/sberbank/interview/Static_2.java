package ru.sberbank.interview;

public class Static_2 {

    static { i = 5; }
    static int i = 6;

    public static void main(String[] args) {
        System.out.println(i);
    }


    /* По байткоду видно, что объявление переменной выносится отдельной строкой, поэтому не важно,
    * в каком статике была объявлена i. Далее в порядке объявления статиков срабатывает сначала блок,
    * потом присвоение переменной */
}
