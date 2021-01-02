package cn.itcast.reflect1;

import java.lang.reflect.Constructor;

public class reflectDemo02 {
    public static void main(String[] args) throws Exception {
        Class<Person> pc = Person.class;
        Constructor<Person> constructor = pc.getConstructor();
        System.out.println(constructor);
        Constructor<?>[] constructors = pc.getConstructors();
        for (Constructor<?> constructor1 : constructors) {
            System.out.println(constructor1);
        }
        Constructor<Person> c1 = pc.getConstructor(String.class, int.class, String.class, String.class, String.class, String.class);
        System.out.println(c1);


    }
}
