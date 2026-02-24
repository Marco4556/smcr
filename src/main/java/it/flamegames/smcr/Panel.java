package it.flamegames.smcr;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Graphics2D;

public class Panel extends JPanel implements KeyListener, MouseListener, ActionListener {
    private Scene currentScene;
    private Timer timer;

    public Panel() {
        setPreferredSize(new Dimension(960, 720));
        setBackground(new Color(0, 0, 0));

        timer = new Timer(16, this);
        timer.start();

        currentScene = new GameScene();
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        currentScene.draw(g2d);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        currentScene.mousePressed(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentScene.update();
        repaint();
    }
}
