package cn.husins.lesson01;

import java.awt.*;

public class TestAll {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        

        frame.setLayout(new GridLayout(2,1));
        frame.add(panel1);
        frame.add(panel2);

        // 上面窗体
        Button button1 = new Button("btn1");
        Button button2 = new Button("btn2");
        Button button3 = new Button("btn3");
        Button button4 = new Button("btn4");
        Panel panel3 = new Panel();
        panel3.setLayout(new GridLayout(2,1));
        panel3.add(button3);
        panel3.add(button4);

        panel1.setLayout(new FlowLayout());
        panel1.add(button1);
        panel1.add(panel3);
        panel1.add(button2);


        // 下面窗体
        Button button5 = new Button("btn5");
        Button button6 = new Button("btn6");
        Button button7 = new Button("btn7");
        Button button8 = new Button("btn8");
        Button button9 = new Button("btn9");
        Button button10 = new Button("btn10");

        Panel panel4 = new Panel();
        panel4.setLayout(new GridLayout(2,2));
        panel4.add(button7);
        panel4.add(button8);
        panel4.add(button9);
        panel4.add(button10);

        panel2.setLayout(new FlowLayout());
        panel2.add(button5);
        panel2.add(panel4);
        panel2.add(button6);





        frame.setVisible(true);


    }
}
