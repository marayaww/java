package cn.itcast.annotation;

import java.lang.reflect.Method;

/*
* 框架类:
* 前提:不能改变该类任何代码,可以创建任意类的对象可以执行任意方法.
*
* */
@Pro(className="cn.itcast.annotation.Demo2",methodName ="show2")
public class ReflectorTEST {
    public static void main(String[] args) throws Exception {
        //1,解析注解,
        //1.1,获取该类的字节码文件对象
        Class<ReflectorTEST> reflectorTESTClass = ReflectorTEST.class;
        //获取上面的注解对象
        //其实就是在内存中生成了该类注解接口的子类实现类对象
        Pro an = reflectorTESTClass.getAnnotation(Pro.class);
    /**
     public class ProImpl implements Pro{
          public String className() {
              return "cn.itcast.annotation.Demo1";
          }
          public String methodName() {
              return "show1";
          }
      }*/
        String className = an.className();
        String methodName = an.methodName();
        Class<?> cls = Class.forName(className);
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);


    }
}
