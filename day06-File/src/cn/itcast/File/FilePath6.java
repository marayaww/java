package cn.itcast.File;

import java.io.File;
import java.io.IOException;


public class FilePath6 {
    public static void show() {
        File file = new File("a");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

    }

    public static void show2() {
        File file = new File("a");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file);
        }
    }


    public static void main(String[] args) throws IOException {
        show2();
//        show();
//        show1();

    }

    private static void show1() throws IOException {
        File file = new File("a\\a.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }

}
