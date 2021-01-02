package cn.itcast.File;

import java.io.File;

public class FilePath3 {
    public static void main(String[] args) {
//        show("C:\\", "b.txt");
        show("D:\\b\\", "b.txt");
        show2();
        show3();

    }

    private static void show2() {
        File parent = new File("C:\\");
        File file =new File(parent,"b.txt");
        System.out.println(file);

    }
    private static void show3() {
        File parent = new File("C:\\");
        File file =new File(parent.getAbsoluteFile(),"b.txt");
        System.out.println(file);

    }

    private static void show(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }
}
