package cn.husins.lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {

    }
}

class WindowFrame extends Frame{
    public WindowFrame() {
        setBackground(Color.cyan);
        setBounds(100,100,200,200);
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
            }

            @Override
            public void windowIconified(WindowEvent e) {
                super.windowIconified(e);
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                super.windowDeiconified(e);
            }

            @Override
            public void windowActivated(WindowEvent e) {
                super.windowActivated(e);
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                super.windowDeactivated(e);
            }

            @Override
            public void windowStateChanged(WindowEvent e) {
                super.windowStateChanged(e);
            }

            @Override
            public void windowGainedFocus(WindowEvent e) {
                super.windowGainedFocus(e);
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                super.windowLostFocus(e);
            }
        });
    }


}
