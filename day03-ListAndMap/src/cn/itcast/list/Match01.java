package cn.itcast.list;

import java.util.regex.Pattern;

public class Match01 {
    public static void main(String[] args) {
        String a="I am an appplele,and you?";
        String b=".*app.*le.*";
        boolean matches = Pattern.matches(b, a);
        System.out.println(matches);
    }
}
