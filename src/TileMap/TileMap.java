package TileMap;

import Main.GamePanel;

import java.awt.image.BufferedImage;

public class TileMap {

    // position
    private double x;
    private double y;

    //ribos
    private int xmin;
    private int ymin;
    private int xmax;
    private int ymax;
    private double tween;

    // map
    private int[][] map;
    private int tileSize;
    private int numRows;
    private int numCols;
    private int width;
    private int height;

    //tilesetas
    private BufferedImage tileset;
    private int numTilesAcross;
    private Tile[][] tiles;

    //draw
    private int rowOffset;
    private int colOffset;
    private int numRowsToDraw;
    private int numColsToDraw;

    public TileMap (int tileSize){
        this.tileSize = tileSize;
        numRowsToDraw = GamePanel.HEIGHT / tileSize + 2;
        numColsToDraw = GamePanel.WIDTH / tileSize + 2;
        tween = 0.07;
    }

    public void loadTiles (String s){
        try {
            getClass().getResourceAsStream(s);
            numTilesAcross = tileset.getWidth() / tileSize;
            tiles = new Tile[2][numTilesAcross];

            BufferedImage subimage;
            for(int col = 0; col < numTilesAcross; col++){
                subimage = tileset.getSubimage(col * tileSize,0,tileSize,tileSize);
            }
            tiles[0][col] = new Tile(subimage, Tile.NORMAL);
            subimage = tileset.getSubimage(col * tileSize, tileSize,tileSize,tileSize);
            tiles[1][col] = new Tile(subimage, Tile.BLOCKED);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void loadMap (String s){}





}
