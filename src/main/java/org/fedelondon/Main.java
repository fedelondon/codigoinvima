package org.fedelondon;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        GUIFind gui = new GUIFind();
        gui.setContentPane(gui.jppal);
        gui.setTitle("Buscar codigo invima");
        gui.setSize(800, 600);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}