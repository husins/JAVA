package cn.husins.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo8 {
    public static void test01() {
        User1 user1 = new User1();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user1.getName();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("正常执行所用时间：" + (endTime - startTime) + "ms");
    }

    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User1 user1 = new User1();
        Class c = user1.getClass();
        Method getName = c.getDeclaredMethod("getName", null);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user1,null);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("反射执行所用时间：" + (endTime - startTime) + "ms");
    }
    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User1 user1 = new User1();
        Class c = user1.getClass();
        Method getName = c.getDeclaredMethod("getName", null);
        getName.setAccessible(true);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user1,null);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("关闭检查所用时间：" + (endTime - startTime) + "ms");
    }
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        test01();
        test02();
        test03();
    }
}
