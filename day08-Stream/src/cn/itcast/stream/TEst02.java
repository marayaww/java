package cn.itcast.stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.lang.String;
public class TEst02 {
        public static void main(String[] args) {
            Collection<java.lang.String> c = new ArrayList<>();
            c.add("one");
            c.add("two");
            c.add("three");
            c.add("four");
            c.add("five");
//            List<String> collect = c.stream().filter(o->o.contains("f")).collect(Collectors.toList());
            String[] strings = c.toArray(new String[c.size()]);
            for (String string : strings) {
                System.out.println(string);
            }

            String[] array = c.toArray(new String[c.size()]);
            for (String s : array) {
                System.out.println(s);
            }
            System.out.println("================");
            List<String> list = Arrays.asList(array);
            for (String s : list) {
                System.out.println(s);
            }
          /**list.add("six");
            从数组转化来的集合不能添加元素,否则会抛出异常,想要添加
           就必须创建新的结合*/
            System.out.println(list);
            List<String> list1=new ArrayList<>();
//            list1.add("six");
            System.out.println(list1);
            /**
             *
             */
        }
}
