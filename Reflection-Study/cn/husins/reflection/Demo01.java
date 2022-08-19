package cn.husins.reflection;

/*
    Reflection(反射)：是java被看做准动态语言的关键，借助反射程序在执行期间可以取得任何类的内部信息，并能直接操作任意对象的内部属性及方法

    通过 Class c = Class.forName("java.lang.String") 加载完类之后，在堆内存的方法区就产生了一个Class对象，这个Class对象是唯一的，每个类
    只能有一个Class对象，这个对象中具有一个类的完整结构信息。我们可以通过这个对象看到类的结构。

    正常方式：引入需要的“包类”名称 -> 通过new实例化 -> 取得实例化对象
    反射方式： 实例化对象 -> getClass()方法 -> 得到完整的“包类”名称


    优点：
        可以实现动态创建对象和编译，有很强的灵活性
    缺点：
        对性能有影响，反射可以看做一种解释性操作，相对于其他代码速度会变慢很多
 */


public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 通过反射获取类的class对象,这里要抛出一个异常
        Class c1 = Class.forName("cn.husins.reflection.User1");
        System.out.println(c1);
        Class c2 = Class.forName("cn.husins.reflection.User1");

        // 这里结果是 c1 和 C2的 hashCode 一致，也就是说 c1 和 c2 指向同一个类
        // 可知：一个类在内存中只有一个Class 对象，当重复获取时，获取的都是一个Class对象
        // 一个类被加载之后，类的整个结构都会被封装在Class对象中
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());



    }
}


// 定义一个实体类 ，只有属性的类叫做实体类 通常用 pojo或者entity 表示
class User1{
    public String name;
    private int id;
    private int age;

    public User1() {
        System.out.println("我是无参构造器");
    }

    public User1(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
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

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
