package cn.itcast.File;

import java.io.File;
import java.io.IOException;


public class FilePath7 {

    public static void show2() {
        File file = new File("a\\111");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }

    }

    public static void main(String[] args) throws IOException {
        show2();
//        show1();
//        show0();
//        show5();
    }

    private static void show5() {
        File file = new File("a\\111\\344");
        boolean delete = file.delete();
        System.out.println(delete);
    }

    private static void show0() {
        File file = new File("a\\111\\344");
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);
    }

    private static void show1() throws IOException {
        File file = new File("a\\111\\b.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }

}
