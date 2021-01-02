package cn.itcast.Lambda.interface01;

public class printTest2 {
    public static void main(String[] args) {
       show(s-> System.out.println(s));
       show(System.out::println);
    }

    private static void show(printString p) {
        p.printable("Hello");
    }
}
