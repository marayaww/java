package cn.itcast.reflect2;

import cn.itcast.domain.Person;

import java.lang.reflect.Method;

public class reflectDemo01 {
    public static void main(String[] args) throws Exception {
        Class pc = Person.class;
        Method sleep = pc.getDeclaredMethod("sleep");
        Person p = new Person();
        sleep.invoke(p);
        Method eat = pc.getDeclaredMethod("eat", String.class);
        eat.invoke(p, "food");
        pc.getDeclaredMethod("sleep", String.class).invoke(p, "123room");
        pc.getDeclaredMethod("sleep", int.class).invoke(p, 12);
        Method[] methods = pc.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
            String name1 = pc.getName();
            System.out.println(name1);
        }


    }
}
