package cn.husins.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
    Reflection: 获取运行时类的完整结构

 */
public class Demo06 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class<?> c = Class.forName("cn.husins.reflection.User1");
        // 通过对象获得类的包名和类名
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());

        // 获得类的属性
        Field[] fields = c.getFields(); // 只能找到public属性
        fields = c.getDeclaredFields(); // 可以获取全部属性
        Field name = c.getField("name"); // 获取指定的public属性
        name = c.getDeclaredField("id"); // 获取任意修饰符的指定属性

        // 获得类的方法
        Method[] methods = c.getMethods(); // 获得本类及其父类的全部public方法
        for (Method method : methods) {
            System.out.println("getMethods:" + method);
        }

        Method[] declaredMethods = c.getDeclaredMethods(); // 获得本类的全部方法
        for (Method declaredMethod : declaredMethods) {
            System.out.println("getDeclaredMethods: " + declaredMethod);
        }

        // 获得指定的方法
        Method getName = c.getMethod("getName", null);
        Method setName = c.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        // 获取类的构造器
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        // 获取指定的构造器
        Constructor<?> constructor = c.getConstructor(String.class, int.class, int.class);
        System.out.println(constructor);
    }
}
