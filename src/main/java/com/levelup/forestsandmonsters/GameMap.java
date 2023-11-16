package com.levelup.forestsandmonsters;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMap {

    int totalPositions=0;

    public int getTotalPositions() {
        return totalPositions;
    }
    
    public void setTotalPositions(int pos) {
        totalPositions=pos;
    }

    public Point calculatePosition(Position startingPosition, DIRECTION direction)
    {
        // starting position
        // direction
        Point calPosition = new Point(0, 0);
        return calPosition;
    }
  
}
