package cn.husins.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();
        // 设置布局 这里是流式布局
        frame.setLayout(null);

        frame.setBounds(100,100,400,400);
        frame.setBackground(Color.cyan);

        panel.setBounds(50,50,200,200);
        panel.setBackground(Color.red);

        frame.add(panel);
        frame.setVisible(true);

        // 监听事件，监听窗口事件 system.exit(0)
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
