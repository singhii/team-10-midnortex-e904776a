package com.levelup.forestsandmonsters;

import org.jline.terminal.impl.PosixSysTerminal;
import org.junit.Test;
import com.levelup.forestsandmonsters.Position;
import com.levelup.forestsandmonsters.GameController.DIRECTION;

import ch.qos.logback.core.pattern.PostCompileProcessor;
import io.cucumber.java.sl.Ter.Ters;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.startsWith;

import java.awt.Point;

public class GameMapTest {

    @Test
    public void testGetTotalPositions(){
        GameMap g = new GameMap();
        int expectedMoves=0;
        int actualMoves=g.getTotalPositions();
        assertEquals(expectedMoves,actualMoves);
    }

    @Test
    public void testSetTotalPositions(){
        GameMap g = new GameMap();
        int expectedMoves=4;
        g.setTotalPositions(expectedMoves);
        int actualMoves=g.getTotalPositions();
        
        assertEquals(expectedMoves,actualMoves);
    }

    @Test
    public void testCalculatePosition()
    {
        GameMap gameMap = new GameMap();
        
        Position startingPosition = new Position(0, 0);
        DIRECTION direction = DIRECTION.EAST;

       Position newPosition = gameMap.calculatePosition(startingPosition, direction);
    
       assertEquals(1, newPosition.getPosition().x); 
       assertEquals(0, newPosition.getPosition().y); 

    }

    @Test
    public void testIsPositionValid()
    {
        GameMap gameMap = new GameMap();
        

        Point givePointCoordinate = new Point();
        givePointCoordinate.x = 0;
        givePointCoordinate.y = 0;
        
        Boolean isPosValid = gameMap.isPositionValid(givePointCoordinate);

        assertEquals(true, isPosValid);

    }

}
