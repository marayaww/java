package cn.itcast.reflect1;

import java.lang.reflect.Field;

public class reflectDemo01 {
    public static void main(String[] args) throws Exception {
        Class<Person> pc = Person.class;
        Field[] f = pc.getFields();
        for (Field field : f) {
            System.out.println(field);
        }
        Field b = pc.getDeclaredField("b");
        b.setAccessible(true);
        Person p = new Person();
        Object o = b.get(p);
        System.out.println(o);

    }
}
