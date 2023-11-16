package com.levelup.forestsandmonsters;

import org.junit.Test;
import com.levelup.forestsandmonsters.Position;
import com.levelup.forestsandmonsters.GameController.DIRECTION;

import ch.qos.logback.core.pattern.PostCompileProcessor;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.startsWith;

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
    
       assertEquals(0, newPosition.getPosition().x); 
       assertEquals(0, newPosition.getPosition().y); 

    }
}
