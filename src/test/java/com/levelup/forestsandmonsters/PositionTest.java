package com.levelup.forestsandmonsters;
import org.junit.Test;

import ch.qos.logback.core.pattern.PostCompileProcessor;

import java.awt.Point;
import io.cucumber.java.Before;


import static org.junit.Assert.assertEquals;

public class PositionTest {

    //Position position;
    //= new Position(1, 9);

    @Before
    public void setUp()
    {
        //position = new Position(1, 9);
    }
    
    @Test
    public void testGetPosition()
    {
        Position position = new Position(1, 9);

        Point currentPosition =  position.getPosition();

        assertEquals(1, (int) currentPosition.getX());
        assertEquals(9, (int) currentPosition.getY());
    }

    @Test
    public void testSetPosition()
    {
        Position position = new Position(3, 4);

        position.setPosition(3, 4);
        
        Point updatedPostion = position.getPosition();

        assertEquals(3, (int) updatedPostion.getX());
        assertEquals(4, (int) updatedPostion.getY());
        
    }

}
