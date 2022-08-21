package com.pong;

import java.awt.event.*;
import java.awt.*;
import java.util.*;;
import javax.swing.*;

// The frame is the window basically, it has the title bar and everything.
// Panels are like frames in tkinter. They exist inside the frames, surrounded by the frames.

public class GameFrame extends JFrame {

    GamePanel gamePanel;
    MenuPanel menuPanel;

    // This frame has a constructor, and every time we call the constructor, we want it to do some stuff.

    GameFrame() {
        createMenuPanel();
//        createGamePanel();
    }

    public void createMenuPanel() {
        int result = 0;

        menuPanel = new MenuPanel();
        this.add(menuPanel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // this ususally doesnt happen, so we have to make it.
        this.pack(); // this is a mode where the frame will adjust according to the size of the panel.

        // and finally
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }


    public void createGamePanel() {
        gamePanel = new GamePanel();
        this.add(gamePanel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // this ususally doesnt happen, so we have to make it.
        this.pack(); // this is a mode where the frame will adjust according to the size of the panel.

        // and finally
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}
