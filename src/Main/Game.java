package Main;

import javax.swing.*;
import java.awt.*;

public class Game {

    public static void main(String[] args) throws Exception {

        JFrame window = new JFrame("2D ZAIDIMAS");
        window.setContentPane(new GamePanel());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.pack();
        window.setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation(dim.width / 2 - window.getSize().width / 2, dim.height / 2 - window.getSize().height / 2);

    }
}
