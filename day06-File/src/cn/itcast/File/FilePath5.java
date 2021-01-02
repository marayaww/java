package cn.itcast.File;

import java.io.File;


public class FilePath5 {
    public static void show() {
        File f1 = new File("E:\\IdeaProjects\\java\\b.txt");
        File f2 = new File("b.txt");

    }

    public static void main(String[] args) {
//      show();
        File f1 = new File("E:\\IdeaProjects\\java\\day06-File\\1.txt");
        File f2 = new File("E:\\IdeaProjects");
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());


    }

}
