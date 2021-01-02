package cn.itcast.Lambda.interface01;

public class printTest3 {
    public static void main(String[] args) {
      show(MethodObjectDemo01::printUpperCase);//通过类名调用静态方法.
    }

    private static void show(printString p) {
        p.printable("Hello");
    }
}
