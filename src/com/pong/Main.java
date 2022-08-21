package com.pong;

import java.awt.event.*;
import java.awt.*;
import java.util.*;;
import javax.swing.*;


// Im just following a tutorial here from BroCode, 99 % of this isnt my code.
// Pong Game just for learning and getting some hands on Java Swing.
// https://www.youtube.com/c/BroCodez
public class Main {

    public static void main(String[] args) {

        // So fonts render properly
        System.setProperty("awt.useSystemAAFontSettings","on");
        System.setProperty("swing.aatext", "true");

        // The Game frame is basically the window
        // and we basically just call the frame. That's almost all we have to do here.
        GameFrame frame = new GameFrame();

    }
}
