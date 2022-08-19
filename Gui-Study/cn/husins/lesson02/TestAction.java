package cn.husins.lesson02;

import java.awt.*;
import java.awt.event.*;

public class TestAction {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button = new Button("点我输出惊喜");

        ActionListenerImpl actionListener = new ActionListenerImpl();
        button.addActionListener(actionListener);

        frame.add(button);
        frame.pack();
        frame.setVisible(true);
        windowClose(frame);
    }

    // 关闭窗体事件的方法
    public static void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}


class ActionListenerImpl implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("aaaa");
    }
}
