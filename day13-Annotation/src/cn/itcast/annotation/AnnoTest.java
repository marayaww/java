package cn.itcast.annotation;

public class AnnoTest {
    public static void eat() {
    }
    @MyAnnotation(age=24,pre=Person.p1,anno=@MyAnnotation2,arr={1,2,3,4})
    public static void main(String[] args) {

        eat();

    }
}
