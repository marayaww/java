package cn.itcast.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class mapDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = Arrays.asList("aaa", "bbb", "ccc");
        String[] strings = list1.stream().skip(1).toArray(String[]::new);
        for (String s : strings) {
            System.out.println(s);
        }
        Object[] obj = Stream.of("AA", "BB", "CC").toArray();
        String[] ts = Arrays.copyOf(obj, obj.length, String[].class);
        for (String t : ts) {
            System.out.println(t);
        }
        System.out.println("======================");
        Object[] ob = Stream.of("AA", "BB", "CC").toArray();


    }
}
