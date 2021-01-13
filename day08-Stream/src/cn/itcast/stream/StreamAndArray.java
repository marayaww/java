package cn.itcast.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAndArray {
    public static void main(String[] args) {
// Stream.of(1,2,3,4,5).toArray();
        //String[] st={"a", "b", "c", "d"};
        String[] st = {"a", "b", "c", "d"};
        List<String> list = Arrays.asList(st);
        //String[] string1 = list.stream().toArray(String[]::new);//转换为流才能用方法的引用
        //String[] string2 = list.toArray(new String[list.size()]);
//        String[] string3 = list.stream().toArray(String[]::new);
        String[] string4 = list.stream().toArray(size -> new String[size]);
        Stream<String> st1 = Stream.of(st);
        st1.forEach(System.out::println);
        Object[] obj = list.toArray();
        String[] string5 = Arrays.copyOf(obj, obj.length, String[].class);
        for (String s : string5) {
            System.out.println(s);
        }





       /* List<String> list = (List<String>) Arrays.asList(st);
//        String[] str = list.stream().toArray(String[]::new);
        String[] as = list.stream().toArray(size -> new String[size]);
        String[] st2 = list.toArray(new String[list.size()]);
        String[] strings = list.toArray(new String[list.size()]);
        System.out.println("----------------");
        java.lang.String[] st3 = {"a", "b", "c", "d", "e"};
        List<java.lang.String> list2 = Arrays.asList(st3);
        Object[] obj = list2.toArray();
        String[] st4 = Arrays.copyOf(obj, obj.length, String[].class);
        for (String s : st4) {
            System.out.println(s);
        }*/

    }
}
