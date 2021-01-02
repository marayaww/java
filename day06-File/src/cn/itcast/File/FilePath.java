package cn.itcast.File;

import java.io.File;
/**





*/
public class FilePath {
    public static void main(String[] args) {
        String p = File.pathSeparator;
        System.out.println(p);//路径分隔符":",把一个路径分割成两个路径,
        // 比如   http://127.0.0.1:8080/E:/IdeaProjects/java/day01-BS/web/index.html
        char ps = File.pathSeparatorChar;
        System.out.println(ps);//路径分隔符":",把一个路径分割成两个路径,

        System.out.println("================");

        String se = File.separator;
        System.out.println(se);
        /**
         *
         * 名称分隔符,两个名字中间的斜杠/ 或者 \.
         * 比   如:E:\a\a.txt  Windows
         *        E:/a/a.txt   linux
         *应写成:"E:"+File.separator+"a"+File.separator+"a.txt";
         *用File.separator代替/或者\.
         */



        char c = File.separatorChar;
        System.out.println(c);



    }
}
