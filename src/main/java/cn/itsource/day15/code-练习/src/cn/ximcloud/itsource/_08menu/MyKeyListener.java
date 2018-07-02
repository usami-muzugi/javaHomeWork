package cn.ximcloud.itsource.day15._08menu;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class MyKeyListener implements KeyListener {
    private TextArea textArea;
    public MyKeyListener(TextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //退格符 keyCode=8
        if (e.getKeyCode() == 8) {
            textArea.setText(textArea.getText().substring(0, textArea.getText().length() - 1));
        }
        System.out.println(e);
        textArea.setText(textArea.getText() + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
