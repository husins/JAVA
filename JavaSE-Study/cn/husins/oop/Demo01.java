package cn.husins.oop;

import java.io.IOException;

// class 关键字 代表类
public class Demo01 {
    public static void main(String[] args) {

    }

    // 非静态方法
    public String sayHello(){
        return "hello,world!";
    }

    public int  max(int a, int b){
        return a>b ? a : b;
    }

    public void print(){
        return;
    }

    public void readFile(String file) throws IOException{
        return;
    }

    // 静态方法 即带有static关键字，会随着类的初始化，所初始化，其余的类，只有在被调用的时候才会被初始化
    public static void test(){
        return;
    }
}


