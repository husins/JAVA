package cn.husins.lesson03;

import java.awt.*;

public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}

class MyPaint extends Frame{


    public void loadFrame(){

            setBounds(200,200,600,500);
            setVisible(true);
    }
    // 画笔
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillOval(100,100,100,100);
    }
}
