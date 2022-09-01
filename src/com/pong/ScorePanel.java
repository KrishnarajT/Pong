package com.pong;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import static com.pong.GamePanel.GAME_HEIGHT;
import static com.pong.GamePanel.SCREEN_SIZE;

public class ScorePanel extends JPanel{


    Thread scoreThread;
    JLabel titleLabel, nameLabel;// coz its runnable
    JButton setOneButton;
    JButton setTwoButton;
    Font buttonFont, textFont;

    boolean startButtonPressed = false;

    ScorePanel() {

        // Basic Properties
        this.setFocusable(true);
        this.addKeyListener(new AL());
        this.setPreferredSize(SCREEN_SIZE);
        this.setBackground(new Color(236, 203, 141));
        this.setLayout(null);
        createFont();
        createButtons();
        createText();


        this.add(titleLabel);
        this.add(nameLabel);
        this.add(setOneButton);
        this.add(setTwoButton);

    }

    public void createFont(){
        try {
            buttonFont = Font.createFont(Font.TRUETYPE_FONT,
                    new File("/run/media/krishnaraj/Miscellaneous/Programs/" +
                            "Java/Pong/src/com/fonts/BeonMedium-6d51.otf")).deriveFont(50f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(buttonFont);


            textFont = Font.createFont(Font.TRUETYPE_FONT,
                    new File("/run/media/krishnaraj/Miscellaneous/Programs/" +
                            "Java/Pong/src/com/fonts/AxeonRegular-vmyL4.otf")).deriveFont(50f);
            //register the font
            ge.registerFont(buttonFont);

        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    public void createText(){
        titleLabel = new JLabel();
        titleLabel.setText("PONG");
        titleLabel.setFont(textFont.deriveFont(110f));
        titleLabel.setAlignmentX(Box.CENTER_ALIGNMENT);
        titleLabel.setBounds(380, 20, 400, 150);

        nameLabel = new JLabel();
        nameLabel.setText("Brocode & KPT GAMES");
        nameLabel.setFont(buttonFont.deriveFont(30f));
        nameLabel.setBounds(650, GAME_HEIGHT - 70, 600, 80);


    }

    public void createButtons() {

        // setOne button properties
        setOneButton = new JButton("Set of 3");
        setOneButton.setBounds(400, 200, 200, 80);
        setOneButton.setAlignmentY(Box.CENTER_ALIGNMENT);
        setOneButton.setAlignmentX(Box.CENTER_ALIGNMENT);
        setOneButton.setFocusPainted(false);
        setOneButton.setContentAreaFilled(false);
        setOneButton.setOpaque(true);
        setOneButton.setBackground(new Color(232, 140, 140));
        setOneButton.setFont(buttonFont);;


        // Exit button properties
        setTwoButton = new JButton("Set of 5");
        setTwoButton.setAlignmentY(Box.CENTER_ALIGNMENT);
        setTwoButton.setAlignmentX(Box.CENTER_ALIGNMENT);
        setTwoButton.setBounds(400, 300, 200, 80);
        setTwoButton.setFont(buttonFont);
        setTwoButton.setFocusPainted(false);
        setTwoButton.setContentAreaFilled(false);
        setTwoButton.setOpaque(true);
        setTwoButton.setBackground(new Color(232, 140, 140));


        setOneButton.addActionListener(e -> {
            System.out.println("starting Game");
            GamePanel.setSets(3);
            Main.changeFrame(1);
        });

        setTwoButton.addActionListener(e -> {
            GamePanel.setSets(5);
            Main.changeFrame(0);
        });

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
