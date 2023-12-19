package Entity;

import TileMap.TileMap;

import java.awt.*;

public abstract class MapObject {

    protected TileMap tileMap;
    protected int tileSize;
    protected double xmap;
    protected double ymap;

    //POSITION IR VEKTORIUS
    protected double x;
    protected double y;
    protected double dx;
    protected double dy;

    //DIMENSIONS
    protected int width;
    protected int height;

    //COLLISIONS BOX

    protected int cwidth;
    protected int cheight;

    //COLLISION

    protected int currRow;
    protected int currCol;
    protected double xdest;
    protected double ydest;
    protected double xtemp;
    protected double ytemp;
    protected boolean topLeft;
    protected boolean topRight;
    protected boolean bottomLeft;
    protected boolean bottomRight;

    //ANIMACIJOS

    protected Animation animation;
    protected int currentAction;
    protected int previousAction;

    //MOVEMENT

    protected boolean left;
    protected boolean right;
    protected boolean up;
    protected boolean down;
    protected boolean jumping;
    protected boolean falling;

    //MOVEMENT PHYS

    protected double moveSpeed;
    protected double maxSpeed;
    protected double stopSpeed;
    protected double fallSpeed;
    protected double maxFallSpeed;
    protected double jumpStart;
    protected double stopJumpSpeed;

    public MapObject(TileMap tm){
        tileMap = tm;
        tileSize = tm.getTileSize();
    }

    public boolean intersects (MapObject o) {
        Rectangle r1 = new Rectangle()
    }




}
