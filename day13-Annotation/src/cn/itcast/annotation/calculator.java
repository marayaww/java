package cn.itcast.annotation;

public class calculator {
    //加法
@Check
    public void add(){
        String a=null;
        a.toLowerCase();
        System.out.println("1+0="+(1+0));
    }
    //减法
    @Check
    public void sub(){
        System.out.println("1-0="+(1-0));
    }
    //乘法
    @Check
    public void mul(){
        System.out.println("1*0="+(1*0));
    }
    //除法
    @Check
    public void div(){
        System.out.println("1/0="+(1/0));
    }
    public void show(){
        System.out.println("永无bug>>>>>>>>>>>>>>>>");
    }
}
