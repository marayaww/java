package cn.itcast.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 元注解:用于描述注解的注解
 @ Target();描述注解能够作用的位置
 ElementType取值:
 1,TYPE  类上
 2,METHOD   方法上
 3,FIELD    成员变量上.

 @ Retention():描述注解被保留的阶段
 Retention(RetentionPolicy.RUNTIME)     一般只取这一个值.保留在运行阶段
 Retention(RetentionPolicy.CLASS) 含义:当前被描述的注解会保留到class字节码文件中

 @Documented:描述注解是否被抽取到API文档中

        @  Inherited:描述注解是否被子类继承.

 */

/*@Target(value={ElementType.METHOD,ElementType.FIELD,ElementType.TYPE})*/
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Myanno3 {
}
