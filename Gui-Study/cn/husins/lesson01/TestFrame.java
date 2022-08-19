package cn.husins.lesson01;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {

        Frame frame = new Frame("我的第一个Java图形化界面窗口");

        // 设置可见性
        frame.setVisible(true);

        // 设置窗口大小
        frame.setSize(400,400);

        // 设置背景颜色 color
        Color color = new Color(191, 21, 21);
        frame.setBackground(color);

        // 页面弹出的初始位置
        frame.setLocation(200,200);

        // 设置窗口大小不可变
        frame.setResizable(false);

    }
}
