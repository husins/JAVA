package cn.husins.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

// 游戏的面板
public class GamePanel extends JPanel implements KeyListener, ActionListener {

    // 定义蛇的数据结构
    int length; // 蛇的长度
    int[] snakeX = new int[600]; // 蛇的X坐标
    int[] snakeY = new int[500]; // 蛇的Y坐标

    // 食物的坐标
    int foodx;
    int foody;
    Random random = new Random();

    String fx;

    int source;
    boolean isStart = false;


    boolean isFailed = false;
    Timer timer = new Timer(100,this); // 100毫秒执行一次

    public GamePanel() {
        init();
        // 获得焦点和键盘事件
        this.setFocusable(true);
        this.addKeyListener(this);

        timer.start();
    }

    // 初始化方法
    public void init(){
        length = 3;
        snakeX[0] = 100;snakeY[0] = 100;
        snakeX[1] = 75;snakeY[1] = 100;
        snakeX[2] = 50;snakeY[2] = 100;
        fx = "R";

        foodx = 25 + 25 * random.nextInt(34);
        foody = 75 + 25 * random.nextInt(24);

        source = 0;
    }

    // 绘制图形的方法
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // 清屏
        this.setBackground(Color.WHITE);

        // 绘制静态面板
        Data.header.paintIcon(this,g,25,11); // 头部广告栏
        g.fillRect(25,75,850,600);

        g.setColor(Color.white);
        g.setFont(new Font("微软雅黑",Font.BOLD,18));
        g.drawString("长度："+length,750,35);
        g.drawString("得分："+source,750,55);

        Data.food.paintIcon(this,g,foodx,foody);

        if (fx.equals("R")){
            Data.right.paintIcon(this,g,snakeX[0],snakeY[0]);
        }else if (fx.equals("L")){
            Data.left.paintIcon(this,g,snakeX[0],snakeY[0]);
        }else if (fx.equals("U")){
            Data.up.paintIcon(this,g,snakeX[0],snakeY[0]);
        }else if (fx.equals("D")){
            Data.down.paintIcon(this,g,snakeX[0],snakeY[0]);
        }

        for (int i = 1; i < length; i++) {
            Data.body.paintIcon(this,g,snakeX[i],snakeY[i]);
        }



        if (isStart==false){
            g.setColor(Color.WHITE);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("按下空格开始游戏",300,300);
        }

        if (isFailed){
            g.setColor(Color.RED);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("游戏失败",300,300);
        }
    }




    @Override
    public void keyPressed(KeyEvent e) {
        int KeyCode = e.getKeyCode();
        if (KeyCode == KeyEvent.VK_SPACE){
            if (isFailed){
                isFailed = false;
                init();
            }else {
                isStart = !isStart;
                repaint();
            }
        }

        if (KeyCode == KeyEvent.VK_UP ){
            fx = "U";
        }else if (KeyCode == KeyEvent.VK_DOWN){
            fx = "D";
        }else if (KeyCode == KeyEvent.VK_LEFT){
            fx = "L";
        }else if (KeyCode == KeyEvent.VK_RIGHT){
            fx = "R";
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStart && isFailed == false){
            if (snakeX[0] == foodx && snakeY[0] == foody){
                length++;
                source += 10;
                foodx = 25 + 25 * random.nextInt(34);
                foody = 75 + 25 * random.nextInt(24);
            }

            // 身体移动
            for (int i = length - 1;i > 0; i--){
                snakeX[i] = snakeX[i-1];
                snakeY[i] = snakeY[i-1];
            }

            if (fx.equals("R")){
                snakeX[0] = snakeX[0] + 25;
                if (snakeX[0] > 850){
                    snakeX[0] = 25;
                }
            }else if (fx.equals("L")){
                snakeX[0] = snakeX[0] - 25;
                if (snakeX[0] < 25){
                    snakeX[0] = 850;
                }
            }else if (fx.equals("U")){
                snakeY[0] = snakeY[0] - 25;
                if (snakeY[0]<75){
                    snakeY[0] = 650;
                }
            }else if (fx.equals("D")){
                snakeY[0] = snakeY[0] + 25;
                if (snakeY[0] > 650){
                    snakeY[0] = 75;
                }
            }

            for (int i = 1; i < length; i++) {
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]){
                    isFailed = true;
                }
            }


            //  边界判断


            repaint();
        }
        timer.start();
    }


    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }


}
