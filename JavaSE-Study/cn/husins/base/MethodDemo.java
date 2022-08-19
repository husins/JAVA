package cn.husins.base;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(test(1,2,3,4,5,6));
    }

    // static: 方便类内相互调用
    public static int add(int a , int b){
        return a+b;
    }
    // 方法名相同，参数不同 即 方法重载
    public static double add(double a , double b){
        return a+b;
    }

    // 可变参数：一个方法只能指定一个，必须在所有参数最后
    public static int test(int...i){
        int num = 0;
        for (int x:i) {
            num += x;
        }
        return  num;
    }
}
