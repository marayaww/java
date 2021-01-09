package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class jsoupDemo3 {
    public static void main(String[] args) throws IOException {

        String path = jsoupDemo3.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
//        Elements elements = document.getElementsByTag("student");
//        System.out.println(elements);
//        Elements elements = document.getElementsByAttribute("id");
//        Elements value = document.getElementsByAttributeValue("number", "heima_0001");
//        System.out.println(value);
        Element cast = document.getElementById("a");
        System.out.println(cast);
    }
}
