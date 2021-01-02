package cn.itcast.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflector {
    public static void main(String[] args) throws Exception {
        //创建Properties对象,获取..properties类对象
        Properties pro =new Properties();
        //获取class文件
        //Reflector.class.getClassLoader()获取该类的类加载器,把class文件加载进内存

        ClassLoader classLoader = Reflector.class.getClassLoader();
        //getResourceAsStream("pro.properties"),获取.class文件,形成字节流文件.
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        //加载.class文件字节流
        pro.load(is);
        //获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        //加载该类进内存
        Class cls = Class.forName(className);
        //创建该类的对象
        Object obj = cls.newInstance();
        //获取该类中的方法
        Method method = cls.getMethod(methodName);
        //执行方法.
        method.invoke(obj);

    }
}
