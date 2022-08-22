package com.pong;


import java.awt.event.WindowEvent;

// Im just following a tutorial here from BroCode, 99 % of this isnt my code.
// Pong Game just for learning and getting some hands on Java Swing.
// https://www.youtube.com/c/BroCodez
public class Main {

    static GameFrame gameFrame;
    static MenuFrame menuFrame;
    public static void changeFrame(int status){
        if(status == 1){
            // Closing Menu Screen
            menuFrame.setVisible(false);
            menuFrame.dispose();
            // Starting Game
            gameFrame = new GameFrame();

        }
        else if (status == 0){
            System.out.println("Thanks for Playing! ");
            // User Wants to Exit
            System.exit(0);
        }

    }




    public static void main(String[] args) {

        // So fonts render properly
        System.setProperty("awt.useSystemAAFontSettings","on");
        System.setProperty("swing.aatext", "true");

        // The Game frame is basically the window
        // and we basically just call the frame. That's almost all we have to do here.
        menuFrame = new MenuFrame();
    }
}
