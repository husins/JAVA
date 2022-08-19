package cn.husins.reflection;

/*
    类的主动引用（一定会发生类的初始化）：
        1. 当虚拟机启动，先初始化main方法所在的类
        2. new一个类对象
        3. 调用类的静态成员（除了final）和静态方法
        4. 使用java.lang.reflect包的方法对类进行反射调用
        5. 当初始化一个类，如果其父类没有被初始化，则会先初始化它的父类

    类的被动引用（不会发生类初始化）
        1. 当访问一个静态域时，只有真正声明这个域的类才会被初始化
           例如：当通过子类引用父类的静态变量时，不会导致子类初始化
        2. 通过数组定义类引用，不会触发此类的初始化
        3. 引用常量不会触发此类的初始化（常量在链接阶段就存入调用类的常量池中了）
 */
public class Demo04 {

    static {
        System.out.println("Main方法被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        // 主动引用
//        Son son = new Son();
//        // 反射引用
//        Class.forName("cn.husins.reflection.Demo04");
//
//        /*
//         result:
//                Main方法被加载
//                父类被加载
//                子类被加载
//          类只会被加载一次
//         */

        // 子类不会被加载示例
        System.out.println(Son.b);
        System.out.println(Son.M);
    }

}

class Father {
    static int b = 2;
    static {
        System.out.println("父类被加载");
    }
}

class Son extends Father{
    static {
        System.out.println("子类被加载");
        m = 300;
    }
    static  int  m = 100;
    static final int M = 1;
}