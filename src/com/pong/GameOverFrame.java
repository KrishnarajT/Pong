package com.pong;
import javax.swing.*;

// The frame is the window basically, it has the title bar and everything.
// Panels are like frames in tkinter. They exist inside the frames, surrounded by the frames.

public class GameOverFrame extends JFrame {

    GameOverPanel gameOverPanel;
    GameOverFrame() {
        gameOverPanel = new GameOverPanel();
        this.add(gameOverPanel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // this usually doesnt happen, so we have to make it.
        this.pack(); // this is a mode where the frame will adjust according to the size of the panel.
        // and finally
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}
