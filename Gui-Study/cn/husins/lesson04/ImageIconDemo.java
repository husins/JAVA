package cn.husins.lesson04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame {
    public ImageIconDemo() {
        // 获取图片的地址
        JLabel label = new JLabel();
        URL url = ImageIconDemo.class.getResource("tx.jpg"); // 拿到当前类所在的路径

        // 拿到图片具体内容，并居中设置
        ImageIcon imageIcon = new ImageIcon(url);
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // 创建容器，添加label
        Container container = getContentPane();
        container.add(label);

        // 设置窗体属性
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,200,200);
    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
}
