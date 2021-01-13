package cn.itcast.File;

import java.io.File;
import java.io.IOException;

public class fileChoose {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\IdeaProjects\\java\\day06-File\\1.txt");
        boolean b1 = f1.createNewFile();
//        System.out.println(b1);
        File f2 = new File("2.txt");
        boolean b2 = f2.createNewFile();
//        System.out.println(b2);
        File f3 = new File("E:\\IdeaProjects\\java\\day06-File\\a");
        boolean mkdir = f3.mkdir();
//        System.out.println(mkdir);
        File f4 = new File("a\\d\\c");
//        boolean mkdir1 = f4.mkdir();//不能创建多级文件
//        System.out.println(mkdir1);
        boolean mkdirs = f4.mkdirs();
        System.out.println(mkdirs);

    }
}
