package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class jsoupDemo2 {
    public static void main(String[] args) throws IOException {

        String path = jsoupDemo2.class.getClassLoader().getResource("student.xml").getPath();
//        Document document = Jsoup.parse(new File(path), "utf-8");
        String str=" <students   xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                " \t\t\t xmlns=\"http://www.itcast.cn/xml\" \n" +
                " \t\t   xsi:schemaLocation=\"http://www.itcast.cn/xml  student.xsd\"\n" +
                " \t\t    >\n" +
                " \t<student number=\"heima_0001\">\n" +
                " \t\t<name>tom</name>\n" +
                " \t\t<age>18</age>\n" +
                " \t\t<sex>male</sex>\n" +
                " \t</student>\n" +
                "\t\t \n" +
                " </students>";
//        Document document = Jsoup.parse(str);
//        System.out.println(document);
        URL url=new URL("https://baike.baidu.com/item/%E9%A9%AC%E6%98%A5%E4%BD%B3/4003586?fr=aladdin");
        Document parse = Jsoup.parse(url, 10000);
        System.out.println(parse);

    }
}
