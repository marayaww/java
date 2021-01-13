package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * pc.getField()获取public修饰的成员变量;
 * pc.getDeclaredMethod()获取所有的成员变量,忽略修饰符.
 * 仅仅只是能够获取,不能查看,修改数值.
 * 想要get和set就需要是数据可接近,用 成员变量名.setAccessible(true);暴力反射,忽略访问权限
 * a.setAccessible(true);
 */
public class reflectDemo01 {
    public static void main(String[] args) throws Exception {
        Class pc = Person.class;//通过类名Person获取personde class类对象.
        Field[] fields = pc.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("---------------");
        Method[] methods = pc.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }
        Field a = pc.getField("a");
        Person p = new Person();
        Object o = a.get(p);
        System.out.println(o);
        a.set(p, "张三");

        System.out.println(p);
        System.out.println("===================");
        Field[] df = pc.getDeclaredFields();//获取所有的成员变量包括private修饰的.

        for (Field field : df) {
            System.out.println(field);
        }
        System.out.println("+++++++++++++++++");
        Field d = pc.getDeclaredField("a");
        a.setAccessible(true);//暴力反射,忽略访问权限修饰符.
        Object o1 = a.get(p);
        System.out.println(o1);//没有d.setAccessible(true);就会报IllegalAccessException异常.
    }
}
