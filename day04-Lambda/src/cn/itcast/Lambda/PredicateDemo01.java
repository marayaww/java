package cn.itcast.Lambda;

import java.util.function.Predicate;

public class PredicateDemo01 {
    public static void main(String[] args) {
        show("consumer", n -> n.length() > 5);
    }

    private static void show(String s, Predicate<String> pre) {
        boolean b = pre.test(s);
        System.out.println(b);
    }
}
