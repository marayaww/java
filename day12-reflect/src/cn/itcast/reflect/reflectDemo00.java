package cn.itcast.reflect;

import cn.itcast.domain.Student;

import java.lang.reflect.Method;

/**
  获取class对象的方法
  1,Class.forName(全类名)--->包名+类名
         Class.forName("cn.itcast.domain.Student")
         这种方式主要用于配置文件,参数是字符创,将类名定义在配置文件中读取文件加载类.
  2.类名.class
            多用于参数传递
  Student.class
  3.对象名.class
 多用于对象的获取字节码方式
 */
/**
 *
                    *
                    *
                     *
                    *
                    *
                    *
 * */
public class reflectDemo00 {
    public static void main(String[] args) throws Exception {
        //1,Class.forName(全类名)--->包名+类名
        Class cls1 = Class.forName("cn.itcast.domain.Student");
        System.out.println(cls1);
        //2.类名.class
        Class cls2 = Student.class;
        System.out.println(cls2);
        //3.对象名.class
        Student student = new Student();
        Class cls3 = student.getClass();
        System.out.println(cls1 == cls2);//true
        System.out.println(cls2 == cls3);//true
        //结论
        // 同一个字节码文件(*.class)在一次程序运行过程中,只会被夹在进内存一次,
        // 不论通过哪种方式获取的class对象都是同一个.
    }
}
