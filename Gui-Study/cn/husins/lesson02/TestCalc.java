package cn.husins.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCalc {
    // 建议计算器
    public static void main(String[] args) {
        new Calculator();
    }

}

// 计算器类
class Calculator extends Frame{
    public Calculator(){
        // 三个文本框
        TextField field1 = new TextField(10);
        TextField field2 = new TextField(10);
        TextField field3 = new TextField(20);

        // 一个按钮
        Button button = new Button("=");
        button.addActionListener(new MyCalcullatorLister(field1, field2, field3));
        // 一个标签
        Label label = new Label("+");

        // 布局
        setLayout(new FlowLayout());
        add(field1);
        add(label);
        add(field2);
        add(button);
        add(field3);
        pack();
        setVisible(true);

    }
}

// 监听器类

class MyCalcullatorLister implements ActionListener{

    private TextField field1, field2, field3;
    public MyCalcullatorLister(TextField field1,TextField field2,TextField field3){
            this.field1 = field1;
            this.field2 = field2;
            this.field3 = field3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(this.field1.getText());
        int num2 = Integer.parseInt(this.field2.getText());

        int num3 = num1 + num2;
        this.field3.setText(""+ num3);

        this.field1.setText("");
        this.field2.setText("");
    }
}


