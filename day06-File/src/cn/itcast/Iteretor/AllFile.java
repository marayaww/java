package cn.itcast.Iteretor;

import java.io.File;

public class AllFile {
    public static void main(String[] args) {
        File file = new File("a");
        getAllFile(file);

    }

    public static void getAllFile(File dir) {
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                System.out.println(file);
            }
        }
    }
}
