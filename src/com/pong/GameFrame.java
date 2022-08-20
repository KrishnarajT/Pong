package com.pong;

import java.awt.event.*;
import java.awt.*;
import java.util.*;;
import javax.swing.*;

// The frame is the window basically, it has the title bar and everything.
// Panels are like frames in tkinter. They exist inside the frames, surrounded by the frames.

public class GameFrame extends JFrame {

    GamePanel panel;

    // This frame has a constructor, and every time we call the constructor, we want it to do some stuff.

    GameFrame() {
        panel = new GamePanel();
        this.add(panel);
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
