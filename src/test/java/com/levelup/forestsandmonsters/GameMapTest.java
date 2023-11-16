package com.levelup.forestsandmonsters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
