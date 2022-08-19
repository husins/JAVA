package cn.husins.reflection;

/*
    类加载器：
        类加载器的作用是用来把类（Class）装载进内存。JVM规范定义了如下类型的类的加载器。
            1. Bootstap Classloader： 用C++编写的，是JVM自带的类加载器，负责Java平台核心库，用来装载核心类库，该加载器无法直接获取
            2. Extension Classloader： 负责jre/lib/ext目录下的jar包或者 -D java.ext.dirs 指定目录下的jar包装入工作库
            3. System Classloader： 负责java -classpath 或 -D java.class.path所指的目录下的类与jar包装入工作，是最常用的加载器
            4. 自定义类加载器
    类缓存：标准的JavaSE类加载器可以按照要求查找类，但一旦某个类被加载到类加载器中，它将维持加载（缓存）一段时间，不过JVM垃圾回收机制可以回收这些
            Class对象
 */
public class Demo05 {
    public static void main(String[] args) throws ClassNotFoundException {

        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // 获取系统类加载器的父类加载器 --> 扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //获取扩展类加载器的父类加载器 --> 根加载器
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1); // 这里返回为空，是因为 根加载器是是C++编写 java读取不到

        // 测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("cn.husins.reflection.Demo05").getClassLoader();
        System.out.println(classLoader);

        // 测试当前类是哪个加载器加载的
         classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        // 如何获取系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));

        /*
        双亲委派机制：
            解决问题：包名重名，导致冲突，引起的安全问题
            解决方式： 自下而上的遍历所有的加载器，判断是否已经加载了同名的包
         */
    }
}
