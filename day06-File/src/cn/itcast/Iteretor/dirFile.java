package cn.itcast.Iteretor;

import java.io.File;

public class dirFile {
    public static void main(String[] args) {
        File f1=new File("a");
        getAllFile(f1);
    }

    private static void getAllFile(File dir) {
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()){
                getAllFile(f);
            }else {
                System.out.println(f);
            }


        }

    }
}
