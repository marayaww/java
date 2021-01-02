package cn.itcast.Lambda;

import java.util.function.Consumer;

public class ConsummerDemo03 {
    public static void main(String[] args) {
        show("迪丽热巴",n-> System.out.println(n));//accept只有一个有参数,括号可以省略.
        //如果没有参数,()不能省略.
    }

    private static void show(String str,Consumer<String> con) {
        con.accept(str);
    }
}
