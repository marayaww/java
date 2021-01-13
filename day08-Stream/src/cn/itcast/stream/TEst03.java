package cn.itcast.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TEst03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("菜");
        list.add("鸟");
        list.add("教");
        list.add("程");
        list.add("www.runoob.com");
        String[] s1 = list.toArray(new String[0]);
        int length = s1.length;
        System.out.println(length);
        System.out.println("-------------");
        for (int i = 0; i < s1.length; ++i) {
            String contents = s1[i];
            System.out.print(contents);
        }
    }
}
