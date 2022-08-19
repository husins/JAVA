package cn.husins.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestText01 {
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends Frame{
    public MyFrame(){
        // 获取单行文本
        TextField textField = new TextField();
        add(textField);
        textField.addActionListener(new MyActionListenter2());

        // 设置替换编码
        textField.setEchoChar('*');
        pack();
        setVisible(true);
    }
}


class MyActionListenter2 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取一些资源,返回一个对象
        TextField field = (TextField) e.getSource();
        // 获取输入框的文本
        System.out.println(field.getText());
        field.setText("");
    }
}

