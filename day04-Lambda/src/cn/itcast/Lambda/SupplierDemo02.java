package cn.itcast.Lambda;

import java.util.function.Supplier;

public class SupplierDemo02 {
    public static void main(String[] args) {
        String s = getString(() -> "胡歌");
        System.out.println(s);
    }

    private static String getString(Supplier<String> sup) {
        return sup.get();
    }
}
