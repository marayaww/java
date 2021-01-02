package cn.itcast.Lambda;

import java.util.function.Predicate;

public class PredicateDemo02 {
    public static void main(String[] args) {
        boolean con = show("consumer", n -> n.length() > 5);
        System.out.println(con);
    }

    private static boolean show(String s,Predicate<String> pre) {
        return pre.test(s);


    }
}
