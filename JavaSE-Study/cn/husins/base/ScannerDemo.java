package cn.husins.base;

import java.util.Scanner;
/*
next():
    1. 一定要读取到有效字符后才可以结束
    2. 对输入有效字符自谦遇到的空白，next()方法会自动将其去掉
    3. 只有输入有效字符后才能将其后面输入的空白作为分隔符或者结束符
    4. 不能得到带有空格的字符串


nextLine():
    1. 以回车键为结束符
    2. 可以获得空白

 */

public class ScannerDemo {
    public static void main(String[] args) {
        /*
        // 创建一个扫描器，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收：");

        // 判断用户有没有输入字符串
        if (scanner.hasNext()){
            // 使用next方式接收
            String str = scanner.next();
            System.out.println("输出的内容为："+ str);
        }

        // 关闭IO流
        scanner.close();
        */

        /*
        // 创建一个扫描器，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextLine方式接收：");

        // 判断用户有没有输入字符串
        if (scanner.hasNextLine()){
            // 使用next方式接收
            String str = scanner.nextLine();
            System.out.println("输出的内容为："+ str);
        }

        // 关闭IO流
        scanner.close();

         */

    }
}
