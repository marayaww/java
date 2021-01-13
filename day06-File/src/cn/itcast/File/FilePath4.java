package cn.itcast.File;

import java.io.File;

/**
 * 相对路径:相识与谁,基础是省略掉谁之前的,比如相对于当前的文件夹day06-File
 * E:\IdeaProjects\java\day06-File\web
 * web的相对路径就是day06-File\web,把当前的文件夹的根目录都省掉.
 * <p>
 * F\\A\\B\\C:
 * 相对于B,则C的相对路径就是B\\C,
 * 相对于A,则C的相对路径就是A\\B\\C
 * 换而言之,相对于T,T本身就不能省,T之前的算是根目录,可以省掉
 * T本身可以作为刻度尺,T所在的文件夹的文件享有同等的待遇.
 * 相似于[0,100),0所在的文件夹在y轴,0,包含在内,小于0的都算根目录.
 */
public class FilePath4 {
    public static void show() {
        File f1 = new File("E:\\IdeaProjects\\java\\b.txt");
        File f2 = new File("b.txt");
        System.out.println(f1.getAbsolutePath());
        ;
        System.out.println(f2.getAbsolutePath());
        ;
    }

    public static void main(String[] args) {
//      show();
//      show2();
//      show3();
//      show4();

        File f4 = new File("day05-interface\\src");//day06-File\web
        boolean e = f4.exists();
        System.out.println(e);


    }

    private static void show4() {
        File f1 = new File("E:\\a");
        long length = f1.length();
        System.out.println(length);
    }

    private static void show3() {
        File f1 = new File("E:\\IdeaProjects\\java\\b.txt");
        File f2 = new File("b.txt");
        System.out.println(f1.getName());
        ;
        System.out.println(f2.getName());
        ;

    }

    private static void show2() {
        File f1 = new File("E:\\IdeaProjects\\java\\b.txt");
        File f2 = new File("b.txt");
        System.out.println(f1.getPath());
        ;
        System.out.println(f2.getPath());
        ;
        System.out.println(f1.toString());
    }
}
