package cn.husins.snake;

import javax.swing.*;

// 游戏的主启动类
public class StartGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.add(new GamePanel());


        frame.setBounds(10,10,900,720);
        frame.setResizable(false); // 窗口大小不可变
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
