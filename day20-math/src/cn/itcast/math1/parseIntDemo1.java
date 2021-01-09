package cn.itcast.math1;

import java.util.Random;

public class parseIntDemo1 {
    public static void main(String[] args) {
        int b = Integer.parseInt("100",16);
        int c=Math.min(4,5);
       double d=Math.exp(1);
       double e=Math.pow(2,10);
        System.out.println(e);
        double random = (Math.random())*100;
        double random2 = Math.floor((Math.random())*100)+1;
        System.out.println(random2);
        Random r=new Random();
        int i = r.nextInt(10);
        System.out.println(i);
    }
}

