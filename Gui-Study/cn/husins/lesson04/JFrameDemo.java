package cn.husins.lesson04;

import javax.swing.*;
import java.awt.event.WindowAdapter;

public class JFrameDemo {

    public void init(){
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setBounds(100,100,200,200);
        // 设置文字
        JLabel label = new JLabel("这是一段文字");

        jFrame.add(label);

        // 关闭事件
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrameDemo().init();
    }
}
