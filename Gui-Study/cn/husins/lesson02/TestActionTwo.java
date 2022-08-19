package cn.husins.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionTwo {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button1 = new Button("start");
        Button button2 = new Button("stop");

        // 可以使用 button1.setActionCommand(); 设置 否则走默认值
        // 可以多个按钮只写一个监听类
        MyMonitor myMonitor = new MyMonitor();

        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);

        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);

    }
}

class MyMonitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取按钮信息
        System.out.println(e.getActionCommand());
    }
}
