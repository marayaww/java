package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Constructor;

public class reflectDemo02 {
    public static void main(String[] args) throws Exception {
        Class pc = Person.class;
//        Constructor<Person> constructor = pc.getConstructor(String.class, int.class, String.class);
//        System.out.println(constructor);
//        pc.getConstructor(String.class,int.class,String.class);
//        Constructor<?>[] constructors = pc.getConstructors();
////        System.out.println(constructors.toString());
//        Constructor<Person> con = pc.getConstructor(String.class);
//        System.out.println(con);
        Constructor<?>[] constructors = pc.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
