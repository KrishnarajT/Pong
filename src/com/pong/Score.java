package com.pong;

import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;;
import javax.swing.*;
public class Score extends Rectangle {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1Score = 0;
    int player2Score = 0;
    public static Font plainFont, font;

    public static int sets = 3;
    public static int setCounter = 0;
    public static int player1SetsWon = 0, player2SetsWon = 0;
    Score(int GAME_WIDTH, int GAME_HEIGHT) {

        Score.GAME_HEIGHT = GAME_HEIGHT;
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.setCounter = 0;
        Score.player1SetsWon = 0;
        Score.player2SetsWon = 0;
    }


    public void draw(Graphics g) {
        g.setColor(Color.WHITE);

        try {

            font = Font.createFont(Font.TRUETYPE_FONT,
                    new File("/run/media/krishnaraj/Programs/" +
                            "Java/Pong/src/com/fonts/Calculator.ttf")).deriveFont(70f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(font);


        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        g.setFont(font);
        g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
        g.drawString(String.valueOf(player1Score/10) + String.valueOf(player1Score%10), GAME_WIDTH/2 - 90, 50);
        g.drawString(String.valueOf(player2Score/10) + String.valueOf(player2Score%10), GAME_WIDTH/2 + 30,50);
        g.drawString(String.valueOf(player1SetsWon/10) + String.valueOf(player1SetsWon%10), GAME_WIDTH/2 - 90, GAME_HEIGHT - 10);
        g.drawString(String.valueOf(player2SetsWon/10) + String.valueOf(player2SetsWon%10), GAME_WIDTH/2 + 30,GAME_HEIGHT - 10);

    }
}
