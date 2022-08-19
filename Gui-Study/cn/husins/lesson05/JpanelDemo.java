package cn.husins.lesson05;

import javax.swing.*;
import java.awt.*;

public class JpanelDemo extends JFrame {
    public JpanelDemo() {
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,1,10,10));

        JPanel jPanel = new JPanel(new GridLayout(1, 3));

        jPanel.add(new JButton("1"));
        jPanel.add(new JButton("1"));
        jPanel.add(new JButton("1"));

        container.add(jPanel);
        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JpanelDemo();
    }
}
