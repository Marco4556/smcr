package it.flamegames.smcr;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

public class GameScene extends Scene {
    private BufferedImage mayoImage;
    private BufferedImage background;

    private int points = 0;

    public GameScene() {
        super();

        try{
            mayoImage = ImageIO.read(new File("src/main/sprites/mayo.png"));
            background = ImageIO.read(new File("src/main/sprites/stripes.png"));
        } catch(Exception e){
            System.out.println("Can't find sprite(s)!");
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.drawImage(background, 0, 0, null);
        g2d.drawImage(mayoImage, 960 / 2 - mayoImage.getWidth() / 2, 720 / 2 - mayoImage.getHeight() / 2, null);
        super.draw(g2d);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getX() >= 960 / 2 - mayoImage.getWidth() / 2 && e.getX() <= 960 / 2 + mayoImage.getWidth() / 2 &&
           e.getY() >= 720 / 2 - mayoImage.getHeight() / 2 && e.getY() <= 720 / 2 + mayoImage.getHeight() / 2 &&
           SwingUtilities.isLeftMouseButton(e)) {
            points++;
            System.out.println("Points: " + points);
        }
    }
}