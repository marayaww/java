package cn.itcast.Lambda;

import java.util.function.Function;

public class FunctionDemo01 {
    public static void main(String[] args) {
        int c = change("12", s -> Integer.parseInt(s), n -> n + 100);
        System.out.println(c);
    }

    private static int change(String s, Function<String, Integer> fun1, Function<Integer, Integer> fun2) {
        return fun1.andThen(fun2).apply(s);

    }
}
