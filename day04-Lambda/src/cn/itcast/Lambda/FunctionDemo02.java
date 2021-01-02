package cn.itcast.Lambda;

import java.util.function.Function;

public class FunctionDemo02 {
    public static void main(String[] args) {
        int b = change("赵丽颖,32", s -> s.split(",")[1], n -> Integer.parseInt(n),c->c+100);
        System.out.println(b);
    }

    private static int change(String s,Function<String, String> fun1,Function<String, Integer> fun2,Function<Integer, Integer> fun3) {
        return fun1.andThen(fun2).andThen(fun3).apply(s);

    }
}
