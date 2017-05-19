package me.java.willem.core;

import javax.swing.*;

/**
 * Created by gebruiker on 22-2-2017.
 * If you steal my code i will porform LEGAL Actions against You
 * Project: Java Program
 * Package: me.java.willem.core
 */

public class Welcome{

    public static void main(String[] args) {
        JFrame frame = new JFrame("DogCraft - Network || Launcher");
        frame.setSize(600, 300);
        frame.setResizable(false);
        JLabel t1 = new JLabel("Play the Game");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(t1);
        frame.show();

    }
}
