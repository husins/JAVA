package cn.husins.lesson05;

import javax.swing.*;
import java.awt.*;

public class JScrolDemo extends JFrame {
    public JScrolDemo() {
        // 创建网格布局容器
        Container container = this.getContentPane();

        // 建立文本域
        JTextArea textArea = new JTextArea(20, 50);
        textArea.setText("这是一个文本域测试Demo");

        // 创建Scroll面板（就是滚动栏）
        JScrollPane scrollPane = new JScrollPane(textArea);

        // 添加文本域
        container.add(scrollPane);

        // 设置请求参数
        this.setVisible(true);
        this.setBounds(100,100,300,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JScrolDemo();
    }
}
