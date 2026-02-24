package it.flamegames.smcr;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
    private static void initWindow() {
        JFrame frame = new JFrame("Salted Mayo Clicker: Resalted");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel = new Panel();
        frame.add(panel);
        frame.addKeyListener(panel);
        frame.addMouseListener(panel);

        frame.setSize(960, 720);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Initializing...");

        SwingUtilities.invokeLater(() -> {
            initWindow();
        });
    }
}