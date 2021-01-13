package cn.itcast.Lambda;

import java.util.function.Consumer;

public class AndThenDemo01 {
    public static void main(String[] args) {
        String str = "Hello";
        method(str, s -> System.out.println(s.toUpperCase()), n -> System.out.println(n.toLowerCase()));

    }

    private static void method(String s, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(s);

    }
}
