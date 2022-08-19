package cn.husins.lesson01;

import java.awt.*;

public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        // 生成按钮实例
        Button button1 = new Button("Button-1");
        Button button2 = new Button("Button-2");
        Button button3 = new Button("Button-3");

        // 设置为流式布局
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
        frame.setLayout(flowLayout);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setBounds(100,100,400,400);
        frame.setVisible(true);
    }
}
