package cn.itcast.annotation;

public @interface MyAnnotation {
   /* public abstract String show();
    int show2();
    Person pre();
    MyAnnotation2 anno2();
    int[] show3();
    int*/
    /*String name();*/
    int age();
//    String name() default"张三";
    Person pre();
    MyAnnotation2 anno();
    int[] arr();
}
