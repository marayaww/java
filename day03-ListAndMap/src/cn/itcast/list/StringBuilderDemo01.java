package cn.itcast.list;

public class StringBuilderDemo01 {
    public static void main(String[] args) {
       StringBuilder sb=new StringBuilder(16);
       sb.append("aaa");
       sb.append("bbb");
       sb.append("ccc");
        System.out.println(sb);
    }

}
