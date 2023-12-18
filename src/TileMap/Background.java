package TileMap;

import Main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Background {

    private BufferedImage image;

    private double x;
    private double y;
    private double dx;
    private double dy;
    private double moveScale;

    public Background(String s, double ms) {
        try {
            image = ImageIO.read(getClass().getResourceAsStream(s));
            moveScale = ms;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setPos(double x, double y) {
        this.x = (x * moveScale % GamePanel.WIDTH);
        this.y = (y * moveScale % GamePanel.HEIGHT);
    }

    public void setVector(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public void update() {
        x += dx;
        y += dy;

        // Wrap around the background when it goes off the screen
        if (x < -GamePanel.WIDTH) {
            x += GamePanel.WIDTH;
        }
        if (x > GamePanel.WIDTH) {
            x -= GamePanel.WIDTH;
        }
    }

    public void draw(Graphics2D g) {
        g.drawImage(image, (int) x, (int) y, null);

        // Draw additional copies for a seamless scrolling effect
        if (x < 0) {
            g.drawImage(image, (int) x + GamePanel.WIDTH, (int) y, null);
        }
        if (x > 0) {
            g.drawImage(image, (int) x - GamePanel.WIDTH, (int) y, null);
        }
    }

}
