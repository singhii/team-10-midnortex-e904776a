package com.levelup.forestsandmonsters;
import org.junit.BeforeClass;
import org.junit.Test;
import java.awt.Point;
import io.cucumber.java.Before;
import org.junit.BeforeClass;

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


}
