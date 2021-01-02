package cn.itcast.test;

import cn.itcast.Junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    @Before
    public void init(){
        System.out.println("init............");
    }
    @After
    public void close(){
        System.out.println("close............");
    }
    @Test
    public void testAdd(){
        System.out.println("testAdd...........");
        //创建测试类对象
        Calculator c=new Calculator();
        int result = c.add(1, 3);
        Assert.assertEquals(4,result);

    }
    @Test
    public void testSub(){
        System.out.println("testSub............");
        Calculator c=new Calculator();
        int result = c.sub(4, 3);
       Assert.assertEquals(1,result);

    }

}
