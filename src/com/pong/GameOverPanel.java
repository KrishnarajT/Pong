package com.pong;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import static com.pong.GamePanel.GAME_HEIGHT;
import static com.pong.GamePanel.SCREEN_SIZE;

public class GameOverPanel extends JPanel{


    Thread optionThread;
    JLabel titleLabel, nameLabel, winnerLabel;// coz its runnable
    JButton playAgainButton;
    JButton exitButton;
    Font buttonFont, textFont;

    boolean startButtonPressed = false;

    GameOverPanel() {

        // Basic Properties
        this.setFocusable(true);
//        this.addKeyListener(new AL());
        this.setPreferredSize(SCREEN_SIZE);
        this.setBackground(new Color(210, 166, 255));
        this.setLayout(null);
        createFont();
        createButtons();
        createText();


        this.add(titleLabel);
        this.add(nameLabel);
        this.add(winnerLabel);
        this.add(playAgainButton);
        this.add(exitButton);

    }

    public void createFont(){
        try {
            buttonFont = Font.createFont(Font.TRUETYPE_FONT,
                    new File("/run/media/krishnaraj/Programs/" +
                            "Java/Pong/src/com/fonts/BeonMedium-6d51.otf")).deriveFont(50f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(buttonFont);


            textFont = Font.createFont(Font.TRUETYPE_FONT,
                    new File("/run/media/krishnaraj/Programs/" +
                            "Java/Pong/src/com/fonts/AxeonRegular-vmyL4.otf")).deriveFont(50f);
            //register the font
            ge.registerFont(buttonFont);

        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    public void createText(){
        titleLabel = new JLabel();
        titleLabel.setText("GAME OVER!");
        titleLabel.setFont(textFont.deriveFont(110f));
        titleLabel.setAlignmentX(Box.CENTER_ALIGNMENT);
        titleLabel.setBounds(200, 20, 800, 150);


        winnerLabel = new JLabel();
        if(Score.player1SetsWon> Score.player2SetsWon)
            winnerLabel.setText("Player 1 Wins!");
        else winnerLabel.setText("Player 2 Wins!");
        winnerLabel.setFont(textFont.deriveFont(70f));
        winnerLabel.setAlignmentX(Box.CENTER_ALIGNMENT);
        winnerLabel.setForeground(new Color(0x318046));
        winnerLabel.setBounds(250, 150, 800, 150);

        nameLabel = new JLabel();
        nameLabel.setText("Brocode & KPT GAMES");
        nameLabel.setFont(buttonFont.deriveFont(30f));
        nameLabel.setBounds(650, GAME_HEIGHT - 70, 600, 80);


    }

    public void createButtons() {

        // setOne button properties
        playAgainButton = new JButton("Play Again");
        playAgainButton.setBounds(400, 300, 200, 80);
        playAgainButton.setAlignmentY(Box.CENTER_ALIGNMENT);
        playAgainButton.setAlignmentX(Box.CENTER_ALIGNMENT);
        playAgainButton.setFocusPainted(false);
        playAgainButton.setContentAreaFilled(false);
        playAgainButton.setOpaque(true);
        playAgainButton.setBackground(new Color(246, 189, 209));
        playAgainButton.setFont(buttonFont.deriveFont(25f));;


        // Exit button properties
        exitButton = new JButton("Quit");
        exitButton.setAlignmentY(Box.CENTER_ALIGNMENT);
        exitButton.setAlignmentX(Box.CENTER_ALIGNMENT);
        exitButton.setBounds(400, 400, 200, 80);
        exitButton.setFont(buttonFont.deriveFont(25f));
        exitButton.setFocusPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setOpaque(true);
        exitButton.setBackground(new Color(246, 189, 209));


        playAgainButton.addActionListener(e -> {
            System.out.println("Opening Set Menu");
            Main.changeFrame(4);
        });

        exitButton.addActionListener(e -> {
            Main.changeFrame(0);
        });

    }


//    public static class AL extends KeyAdapter {
//
//        public void keyPressed(KeyEvent e) {
////            paddle1.keyPressed(e);
////            paddle2.keyPressed(e);
//
//        }
//
//        public void keyReleased(KeyEvent e) {
////            paddle1.keyReleased(e);
////            paddle2.keyReleased(e);
//        }
//    }
}
