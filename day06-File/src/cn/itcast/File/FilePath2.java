package cn.itcast.File;

import java.io.File;

/**
 * 绝对路径是完整的路径,以盘符开始的路径,
 * 比如,E:\\IdeaProjects\\java\\day06-File\\1.txt
 * 相对路径是一个简化的路径,
 * 相对指的是相对于当前的目录E:\\IdeaProjects\\java\\day06-File,如果使用带能签项目的根目录,路径可以简化写,
 * E:\\IdeaProjects\\java\\day06-File\\1.txt-->可以简化为:1.txt(可以省略当前项目的根目录)
 * 注意:
 * 路径是不区分大小写的,
 * 路径中的文件名中间的分隔符Windows使用转义字符,两个\\代表一个普通的\.
 * E:\\IdeaProjects\\java\\day06-File\\1.txt  表示的是:
 * E:\IdeaProjects\java\day06-File\1.txt
 * File file=new File(String pathName);
 * 注意:
 * 这里的路径名可以是文件夹也可以是文件
 * 可以使存在的也可以是不存在的
 * 可以使相对路径也可以是绝对路径,
 * 他代表的只是 创建File对象,只是把字符串路径分装为File对象,不考虑路径真假的状况.
 */
public class FilePath2 {
    public static void main(String[] args) {
        File file = new File("E:\\IdeaProjects\\java\\day06-File\\1.txt");
        System.out.println(file);
        //E:\IdeaProjects\java\day06-File\1.txt
        //重写了toString方法.
        File file1 = new File("E:\\IdeaProjects\\java\\day06-File");
        System.out.println(file1);//E:\IdeaProjects\java\day06-File
        File file2 = new File("b.txt");
        System.out.println(file2);//b.txt

    }
}
