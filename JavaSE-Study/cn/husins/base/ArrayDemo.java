package cn.husins.base;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // 数组静态初始化: 创建+赋值 不可改变
        int[] a = {1,2,3,4,5,6,7,8,9};

        // 动态初始化
        int[] b = new int[10];

        // 数组普通循环遍历
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        // foreach 循环遍历数组
        for (int i:a) {
            System.out.println(i);
        }

        int[] s = {213,31,3145,45754,5235,8543542,12341,6346,2143,865,1,4,6,8};
        // 可见形式输出数组
        System.out.println(Arrays.toString(s));

        // 数组排序
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
    }
}
