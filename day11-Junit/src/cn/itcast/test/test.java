package cn.itcast.test;

public class test {
    /**Junit单元测试
     * 测试分类:
     *      1,         黑盒测试:不需要写代码,给输入值,看运行结果
     *      2,        白盒测试:需要写代码,关注程序的运行过程.
     *junit使用:白盒测试
     *步骤:
     * 1.定义一个测试类(测试用例):
     * 建议
     *      测试类名:被测试类名Test  CalculatorTest
     *      包名XXXX.XXX.XXX.test   cn.itcast.test
     * 2.定义测试方法:可以独立运行
     * 建议:
     * 方法名:test测试的类名    testAdd();
     * 返回值:void
     * 参数:空参
     *
     * 3.给方法加@Test
     * 4.给Junit导入依赖环境.
     *判定结果:
     * 绿色成功,红色失败!
     * Assert断言
     * Assert.assertEquals(1,result);(期望结果,运算结果)
     *
     * */

    /**
     * 补充
     * @Before:修饰的方法执会在 测试方法之前执行
     * @After:修饰的方法执会在 测试方法之后执行
     *
     * */
}
