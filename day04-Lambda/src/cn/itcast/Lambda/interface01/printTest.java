package cn.itcast.Lambda.interface01;

public class printTest {
    public static void main(String[] args) {
        show("abc", s -> System.out.println(s));
        show("abcd", System.out::println);
    }

    private static void show(String s, printString p) {
        p.printable(s);
    }
}
