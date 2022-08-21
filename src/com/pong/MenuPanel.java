package com.pong;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static com.pong.GamePanel.SCREEN_SIZE;

public class MenuPanel extends JPanel implements Runnable{


    Thread menuThread; // coz its runnable


    MenuPanel() {
        this.setFocusable(true);
        this.addKeyListener(new AL());
        this.setPreferredSize(SCREEN_SIZE);
        this.setBackground(new Color(236, 203, 141));

        // Creating the Game Thread
        menuThread = new Thread(this);
        menuThread.start();
    }

    public void run() {
        System.out.println("Testing menu");
    }
    public static class AL extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
//            paddle1.keyPressed(e);
//            paddle2.keyPressed(e);

        }

        public void keyReleased(KeyEvent e) {
//            paddle1.keyReleased(e);
//            paddle2.keyReleased(e);
        }
    }
}
