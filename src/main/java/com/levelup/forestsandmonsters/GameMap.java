package com.levelup.forestsandmonsters;

import java.awt.Point;

import javax.naming.directory.DirContext;

import org.stringtemplate.v4.compiler.STParser.element_return;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

import com.levelup.forestsandmonsters.Position;

public class GameMap {

    int totalPositions=0;
    Position position;

    public int getTotalPositions() {
        return totalPositions;
    }
    
    public void setTotalPositions(int pos) {
        totalPositions=pos;
    }

    public Position calculatePosition(Position startingPosition, DIRECTION direction)
    {
       
        Position calPosition = new Position(0,0);

        int startPositionX = startingPosition.getPosition().x;
        int startPositionY = startingPosition.getPosition().y;
        int newPositionX = 0;
        int newPositionY = 0;

        
        if (direction.equals(DIRECTION.EAST))
        {
           //startPositionX = startingPosition.getPosition().x;
           newPositionX = ++startPositionX;
          
        }
        else if(direction.equals(DIRECTION.WEST))
        {
            //startPositionX = startingPosition.getPosition().x;
            newPositionX = --startPositionX;
        }
        else if(direction.equals(DIRECTION.NORTH))
        {
            //startPositionY = startingPosition.getPosition().y;
            newPositionY = ++startPositionY;
        }
        else if(direction.equals(DIRECTION.SOUTH))
        {
            //startPositionY = startingPosition.getPosition().y;
            newPositionY = ++startPositionY;
        }
        else{
            newPositionX = startPositionX;
            newPositionY = startPositionY;
        }

        calPosition.setPosition(newPositionX, newPositionY);

        return calPosition;
    }

    public boolean isPositionValid(Point positionCoordinate) {


        if(positionCoordinate.x <= 9 || positionCoordinate.x >= 0){
            return true;
        }
        else if (positionCoordinate.y <= 9 || positionCoordinate.y >= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Position getPosition(int x, int y)
   {
        Position getMapPosition = new Position(x, y);

        return this.position = getMapPosition;
   }
  
}
