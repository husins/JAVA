package cn.husins.lesson01;

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 400, Color.blue);
        MyFrame myFrame2 = new MyFrame(300, 100, 200, 400, Color.blue);
        MyFrame myFrame3 = new MyFrame(100, 500, 200, 400, Color.blue);
        MyFrame myFrame4 = new MyFrame(300, 500, 200, 400, Color.blue);
    }

}

class MyFrame extends Frame{
    static int id = 0;
    public MyFrame(int x ,int y, int w, int h, Color color) throws HeadlessException {
        super("MyFrame: "+ (++id));
        setVisible(true);
        setBounds(x, y, w, h);
        setBackground(color);
        setResizable(false);
    }
}