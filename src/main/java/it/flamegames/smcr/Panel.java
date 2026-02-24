package it.flamegames.smcr;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Graphics2D;

public class Panel extends JPanel implements KeyListener {
    private BufferedImage mayoImage;

    public Panel() {
        setPreferredSize(new Dimension(960, 720));
        setBackground(new Color(0, 0, 0));

        try{
            mayoImage = ImageIO.read(new File("src/main/sprites/mayo.png"));
        } catch(Exception e){
            System.out.println("Can't find sprite(s)!");
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(mayoImage, 100, 100, null);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }
}
