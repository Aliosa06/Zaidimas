package GameState;

import java.awt.*;

import Main.GamePanel;
import TileMap.*;


public class Level1State extends GameState{

    private TileMap tileMap;
    private Background bg;

    public Level1State (GameStateManager gsm) {
        this.gsm = gsm;
        init();
    }

    @Override
    public void init() {

        tileMap = new TileMap(30);
        tileMap.loadTiles("/Tilesets/grasstileset.gif");
        tileMap.loadMap("/Maps/level1-1.map");
        tileMap.setPosition(0, 0);

        bg = new Background("/Backgrounds/level1bg.png", 0.1);

    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics2D g) {

       bg.draw(g);

        // piesti tilemapa

        tileMap.draw(g);

    }

    @Override
    public void keyPressed(int k) {

    }

    @Override
    public void keyReleased(int k) {

    }
}
