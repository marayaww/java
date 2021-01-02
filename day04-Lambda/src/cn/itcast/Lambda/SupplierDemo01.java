package cn.itcast.Lambda;

import java.util.function.Supplier;

public class SupplierDemo01 {

    public static void main(String[] args) {
        String s = getString( () -> "迪丽热巴");
        System.out.println(s);
    }

    public static String getString(Supplier<String> sup) {
        return sup.get();
    }
}
