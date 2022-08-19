package cn.husins.base;

public class Variable {

    // 类内的变量称之为属性,在整个类内有效
    // 当属性被实例化调用，如果没有赋值，就表示该类型的0值，布尔类型0值是false
    String name;
    int age;
    // 当一个属性被 static 修饰,可以直接被调用
    static int slary = 123;

    // final 用来定义常量，常量一般用纯大写字母表示
    final static double PI = 3.14;

    // main方法，是程序主方法，一个程序的入口
    public static void main(String[] args) {
        //方法内的变量只在该方法内有效
        int i= 1;
        System.out.println(i);
        Variable variable = new Variable();
        System.out.println(variable.age);
        System.out.println(variable.name);
        System.out.println(slary);
        System.out.println(PI);
    }


}
