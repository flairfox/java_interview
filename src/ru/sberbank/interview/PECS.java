package ru.sberbank.interview;

import java.util.ArrayList;
import java.util.List;

public class PECS {

    public static void main(String[] args) {
        List<? extends Class3> list1 = new ArrayList<>();
        // Что из нижепредставленного скомпилируется?
        // Class4 class4 = list1.get(0);
        // Class2 class2 = list1.get(0);

        List<? super Class3> list2 = new ArrayList<>();
        // А тут?
        // list2.add(new Class4());
        // list2.add(new Class2());
    }

    private static class Class0 {};
    private static class Class1 extends Class0 {};
    private static class Class2 extends Class1 {};
    private static class Class3 extends Class2 {};
    private static class Class4 extends Class3 {};

}
