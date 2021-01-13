package cn.itcast.stream;

import java.util.ArrayList;
import java.util.Collection;

public class TEst {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        //不常用
//		Object[] array = c.toArray();

        String[] array = c.toArray(new String[c.size()]);
        System.out.println(array.length);
        for (String str : array) {
            System.out.println(str);
        }
    }
}
