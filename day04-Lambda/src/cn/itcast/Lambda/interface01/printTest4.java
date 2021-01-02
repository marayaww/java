package cn.itcast.Lambda.interface01;

public class printTest4 {
    public static void main(String[] args) {
     show(s->{
        MethodObjectDemo01 obj=new MethodObjectDemo01();
        obj.printUpperCase(s);
     });
    }

    private static void show(printString p) {
        p.printable("Hello");
    }
}
