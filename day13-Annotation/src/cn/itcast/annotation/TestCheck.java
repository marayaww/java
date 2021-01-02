package cn.itcast.annotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCheck {
    public static void main(String[] args) throws Exception {
        calculator c = new calculator();
        Class cls = c.getClass();
        Method[] methods = cls.getMethods();
        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    number++;
                    bw.write(method.getName() + "方法出现了异常");
                    bw.newLine();
                    bw.write("异常的名称是" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因是" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("===============");
                    bw.newLine();
                }
            }
        }
        bw.write("本次一共出现次" + number + "异常");
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
