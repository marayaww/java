package cn.itcast.Lambda.interface01;

public class printTest5 {
    public static void main(String[] args) {
//     show(s->{
//       MethodObjectDemo01.printUpperCase(s);
//     });
//    }
    show(s->MethodObjectDemo01.printUpperCase(s));
        show(MethodObjectDemo01::printUpperCase);
        String substring = "sbc".substring(1);
        System.out.println(substring);
}

    private static void show(printString p) {
        p.printable("Hello");
    }
}
/**
 *
 */