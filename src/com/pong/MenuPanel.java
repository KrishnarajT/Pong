package com.pong;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import static com.pong.GamePanel.GAME_HEIGHT;
import static com.pong.GamePanel.SCREEN_SIZE;

public class MenuPanel extends JPanel implements Runnable{


    Thread menuThread;
    JLabel titleLabel, nameLabel;// coz its runnable
    JButton startButton;
    JButton exitButton;
    Font buttonFont, textFont;

    boolean startButtonPressed = false;

    MenuPanel() {

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
        this.add(startButton);
        this.add(exitButton);
        // Creating the Game Thread
        menuThread = new Thread(this);
        menuThread.start();
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

        // Start button properties
        startButton = new JButton("Start");
        startButton.setBounds(400, 200, 200, 80);
        startButton.setAlignmentY(Box.CENTER_ALIGNMENT);
        startButton.setAlignmentX(Box.CENTER_ALIGNMENT);
        startButton.setFocusPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setOpaque(true);
        startButton.setBackground(new Color(232, 140, 140));
        startButton.setFont(buttonFont);;


        // Exit button properties
        exitButton = new JButton("Exit");
        exitButton.setAlignmentY(Box.CENTER_ALIGNMENT);
        exitButton.setAlignmentX(Box.CENTER_ALIGNMENT);
        exitButton.setBounds(400, 300, 200, 80);
        exitButton.setFont(buttonFont);
        exitButton.setFocusPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setOpaque(true);
        exitButton.setBackground(new Color(232, 140, 140));


        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Testing ok");
                setStartButton(true);
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Testing submit");
                System.exit(0);
            }
        });

    }

    public void setStartButton(boolean value){
        if (value){
            this.setVisible(false);
        }
    }

    public void run() {
        System.out.println("Testing menu");
//        while(true){
//            if(startButtonPressed){
//                System.out.println("pressed that button");
//            }
//        }
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
