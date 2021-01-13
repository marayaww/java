package cn.itcast.File;

import java.io.File;
import java.io.IOException;

public class File6 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("a/b/c");
        boolean m1 = f1.mkdirs();
        System.out.println(m1);
        boolean m2 = new File("a\\b\\d").mkdirs();
        System.out.println(m2);
        System.out.println(new File("a\\b\\e").mkdirs());
        System.out.println(new File("a\\b\\a.txt").createNewFile());
        System.out.println(new File("a\\b\\b.txt").createNewFile());


    }
}
