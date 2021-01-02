package cn.itcast.error;

public class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person2{" + "name=\"" + name + "\"" + ", age=" + age + '}';
        //return "Person2{" +"name='" + name + '\'' +", age=" + age +"}";//两者有何区别.'\''解释语义.

    }

    public String getName() {
        return name;
    }

    public void eat2() {

    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        System.out.println("aaa");
        this.name = name;
        this.age = age;

    }

    public Person() {
        System.out.println("aaa");
    }

    public static class Test {
        public static void main(String[] args) {
            int a = 0;
            String b = "abc";
            System.out.println(b + a + '}');
            System.out.println(b + a + "}");

        }
    }
}
