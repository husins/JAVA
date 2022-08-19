package cn.husins.lesson03;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TestKeyListener {
    public static void main(String[] args) {
        new KeyFrame();
    }
}

class KeyFrame extends Frame{
    public KeyFrame() {
        setBounds(1,2,300,400);
        setVisible(true);

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int KeyCode = e.getKeyCode();
                if (KeyCode == KeyEvent.VK_UP){
                    System.out.println("你按下了上键");
                }
            }
        });
    }
}
