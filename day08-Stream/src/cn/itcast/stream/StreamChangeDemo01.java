package cn.itcast.stream;

import java.util.stream.Stream;

public class StreamChangeDemo01 {
    public static void main(String[] args) {
        Stream<Integer> is = Stream.of(1, 2, 3, 4, 5, 6);
        Object[] obj = is.toArray();
        for (Object o : obj) {
           int b=(int)o;
            System.out.println(b);
        }
    }
}
