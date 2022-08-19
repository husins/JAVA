package cn.husins.base;

public class Type_conversion {
    public static void main(String[] args) {
        // 八大数据类型
        int num1 = 2147483647;
        byte num2 = 127;
        short num3 = 32767;
        long num4 = 9223372036854775807L;

        float num5 = 50.1F;
        double num6 = 3.1415926;

        // 字符用单引号，字符串用双引号，String 不是关键字
        char name = 'H';
        String name2 = "Husins";

        boolean flag = true;

        // 1 byte = 8 bit


        // 进制表示
        int i = 10;
        int i1 = 010;// 8进制
        int i2 = 0x10;// 16进制
        int i3 = 0b10;// 2进制

        // float  和 double 差异 , 少用浮点数进行比较
        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f == d); //false

        float d1 = 1231231231231123f;
        float d2 = d1 + 1;
        System.out.println(d1 == d2); //true

        // 字符串强转int
        char c1 = 'H';
        char c2 = '中';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println((int)c1);
        System.out.println((int)c2);

        char c3 = '\u0061';
        System.out.println(c3);


        // 字符串比较
        String s1 = new String("husins");
        String s2 = new String("husins");
        System.out.println(s1==s2); //false
        String s3 = "husins";
        String s4 = "husins";
        System.out.println(s3==s4); //true


        // 由低到高
        // byte,short,char->int->long->float->double
        // 运算中，不同类型的数据先转化为同一类型，然后进行运算

        // 高类型转换为低类型，强制类型转化，可能会造成溢出
        // 低类型转换为高类型，不需要强制转换
        // 不能对布尔类型进行转换
        // float、doule 转换为int 会造成精度丢失 即 1.23 ——> 1

        int ii = 128;
        byte b = (byte)ii; // 强转转换
        System.out.println(b);
        double dd = ii; // 低类型转换为高类型
        System.out.println(dd);

        // JDK7 新特性 数字之间可以用下滑线分割 不影响数字使用
        int money = 1_000_000_000;
        int years = 20;
        int total = money*years;
        System.out.println(total); // 发生溢出
        // 解决上面问题
        long total2 = money*((long)years);
        System.out.println(total2);
    }
}
