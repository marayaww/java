package demo01;

import demo01.Student;

public class demo06Student {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("---------------");
        stu.name = "马春佳";
        stu.age = 19;
        System.out.print(stu.name + ":");
        System.out.println(stu.age);
        stu.eat();
        stu.study();

    }
}
