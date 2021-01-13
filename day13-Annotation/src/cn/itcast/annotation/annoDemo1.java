package cn.itcast.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 注解:
 * 作用:
 * 1,编写文档:通过代码里标识的注解生成文档[生成DOC文档]
 * 2,代码分析:通过代码里标识的注解对代码进行分析[使用反射技术]
 * 3,代码分析:通过代码里标识的注解让编译器能够对代码进行基本的检查[如override]
 * <p>
 * JDK中预定义的一些注解
 * 1,@Override               检测被注解的方法是否是继承父类(接口)的方法
 * <p>
 * 2, @Deprecated            该注解标识的内容,标识已过时.
 * <p>
 * 3, @SuppressWarnings()     压制警告.
 * <p>
 * 自定义注解:
 * 格式:
 * 元注解
 * public @interface 注解名称 { }
 * <p>
 * 注解的本质:
 * 注解就是一个接口,该接口默认继承Annotation接口
 * 属性:
 * 接口中的抽象方法
 * 要求:
 * 1,属性的返回值-->不能是void
 * 基本的数据类型.
 * 字符串
 * 枚举
 * 注解
 * 以上数据类型的数组
 * 2,定义了属性,就要改属性赋值,尽量使用语义化表达
 * 如果属性default修饰,  String name() default"张三";则可以省掉name,赋值
 * 如果属性只有一个,name属性名称可以省略.
 * 如果是数组,要用{},如果只有一个元素,{}可以省略.
 */
@SuppressWarnings("all")
public class annoDemo1 {
    /**
     * 计算两数的和
     *
     * @param a 整数
     * @param b 整数
     * @return 两数的和
     */
    public int calculator(int a, int b) {
        return a + b;
    }

    @Deprecated
    public static void show1() {
        System.out.println("已过时");
    }

    @SuppressWarnings("all")
    public static void show2() {
        System.out.println("fation");
    }

    public static void main(String[] args) {

    }
}
