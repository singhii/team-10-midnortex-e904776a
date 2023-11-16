package com.levelup.forestsandmonsters;
import java.awt.Point;

public class Position {

    Point coordinates;

    // constructor 
    public Position(int xCoordinates, int yCoordinates)
    {
        this.coordinates = new Point(xCoordinates, yCoordinates);
    }

    public Point getPosition() 
    {
        return coordinates;
    }
    
    public void setPosition(int xCoordinates, int yCoordinates)
    {
        coordinates.setLocation(xCoordinates, yCoordinates);
    }

    
}
