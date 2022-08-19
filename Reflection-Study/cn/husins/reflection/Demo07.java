package cn.husins.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    通过反射动态的创建对象
 */
public class Demo07 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        // 获得Class对象
        Class<?> c = Class.forName("cn.husins.reflection.User1");

        // 构造一个对象
//        User1 user = (User1) c.newInstance(); // nweInstance本质上是调用类的无参构造器，因此需要 1. 类必须存在无参构造器 2. 类的构造器的访问权限足够
//        System.out.println(user);

        // 通过构造器创建对象
//        Constructor declaredConstructor = c.getDeclaredConstructor(String.class, int.class, int.class);
//        User1 user2 = (User1)declaredConstructor.newInstance("Husins",1, 18);
//        System.out.println(user2);

        // 通过反射调用普通方法
        User1 user3 = (User1) c.newInstance();
        Method setName = c.getDeclaredMethod("setName", String.class);
        setName.invoke(user3,"husins"); // invoke 激活 （对象，"方法的值"）
        /*
        Object invoke(Object obj, Object... args)
            1. Object对应原方法的返回值，若原方法无返回值，此时返回null
            2. 若原方法为静态方法,此时形参Object obj可为null
            3. 若原方法形参列表为空，则Object... args为null
            4. 若原方法声明为private，则需要在调用此invoke()方法前，显式调用方法对象的setAccessible(true)方法，将可访问private的方法
         */
        System.out.println(user3.getName());

        // 通过反射操作属性
        User1 user4 = (User1) c.newInstance();
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        /*
        setAccessisble: 关闭安全检查,一般是操作私有属性来操作
        - setAccessible作用是启动和禁用访问安全检查的开关
        - 参数值为true则表示反射的对象在使用是应该取消java语言访问检查
            1. 提高反射的效率。如果代码中必须使用反射，而该句代码需要频繁的被调用，那么要设置为true
            2. 设置为true使得原本无法访问的私有成员也可以访问
        - 参数值为fasle则表示反射的对象应该试试Java的语言访问检查
         */
        name.set(user4,"husins2");
        System.out.println(user4.name);
    }
}
