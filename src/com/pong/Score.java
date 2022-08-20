package com.pong;

import java.awt.event.*;
import java.awt.*;
import java.util.*;;
import javax.swing.*;
public class Score extends Rectangle {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1Score = 0;
    int player2Score = 0;

    Score(int GAME_WIDTH, int GAME_HEIGHT) {

        Score.GAME_HEIGHT = GAME_HEIGHT;
        Score.GAME_WIDTH = GAME_WIDTH;

    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arvo", Font.PLAIN, 60));
        g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
        g.drawString(String.valueOf(player1Score/10) + String.valueOf(player1Score%10), GAME_WIDTH/2 - 90, 50);
        g.drawString(String.valueOf(player2Score/10) + String.valueOf(player2Score%10), GAME_WIDTH/2 + 20, 50);
    }
}
