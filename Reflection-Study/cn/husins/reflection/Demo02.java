package cn.husins.reflection;

/*
Class类说明：
    1. Class本身也是一个类
    2. Class对象只能由系统建立对象
    3. 一个加载的类在JVM中只会有一个Class对象
    4. 一个Class对象对应的是一个加载到JVM中的.class文件
    5. 每个类的实例都会记得自己是由那个Class实例所生成的
    6. 通过Class可以完整的得到一个类中的所有被加载的结构
    7. 通过Class可以完整的得到一个类中的所有被加载的结构
    8. Class类是Reflection的根源，针对任何你想动态加载、运行的类，唯有先获得相应的Class对象
 */
public class Demo02 {
    // 获取 Class 类的方法


    public static void main(String[] args) throws ClassNotFoundException {
        // 方法一：已知类的全名，且该类在类路径下，可以通过Class类的静态方法forName()获取，可能抛出ClassNotFoundException
        Class<?> c1 = Class.forName("cn.husins.reflection.User2");

        // 方法二：已知某个类的实例，调用该实例额的getClass()方法获取Class对象
        User2 user = new User2();
        Class c2 = user.getClass();

        // 方法三：若已知具体的类，可以通过类的Class属性获取，该方法最为安全可靠，程序性能最高
        Class c3 = User2.class;


        // 方法四：对于内置的基本数据类型的包装类都有一个Type属性
        Class type = Integer.TYPE;

        // 编外1：获得父类类型
        Class superclass = c1.getSuperclass();
    }
}

class User2{
    private String name;
    private int id;
    private int age;

    public User2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}