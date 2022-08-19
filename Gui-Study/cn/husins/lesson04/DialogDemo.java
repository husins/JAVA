package cn.husins.lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo extends JFrame {
    public DialogDemo() {
        this.setVisible(true);
        this.setBounds(10,10,200,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //JFrame 容器
        Container container = this.getContentPane();
        //绝对定位布局
        container.setLayout(null);

        // 按钮
        JButton jButton = new JButton("点击弹出一个对话框");
        jButton.setBounds(30,30,200,50);

        // 点击按钮进行弹窗
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialogDemo();
            }
        });

        container.add(jButton);
    }

    public static void main(String[] args) {
        new DialogDemo();
    }
}

// 弹出的窗口的样式

class MyDialogDemo extends JDialog{
    // 弹窗默认有关闭属性，不需要在单独设计关闭方法
    public MyDialogDemo() {
        this.setVisible(true);
        this.setBounds(10,10,200,400);

        Container container = this.getContentPane();
        container.setLayout(null);

        // 这里的label 没有显示出来，因为没有设置setBounds属性
        container.add(new Label("弹出一个窗口"));

    }
}