package cn.husins.lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo02 {
    public static void main(String[] args) {
        new MyJFrame2().init();
    }
}

class MyJFrame2 extends JFrame{
    public void init(){
         this.setBounds(10,10,200,300);
         this.setVisible(true);

        JLabel label = new JLabel("这是一段文字");
        this.add(label);
        // 设置 文本居中水平对齐
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // 获得一个容器
//        Container container = this.getContentPane();
//        container.setBackground(Color.CYAN);
        this.setBackground(Color.cyan);
    }
}
