package com.levelup.forestsandmonsters;


import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

import static org.junit.Assert.assertEquals;

public class CharacterTest {

    int arbitraryX = 0;
    int arbitraryY = 0;

    @BeforeEach
    public void testSetUp()
    {
         arbitraryX = 1;
    }
    @Test
    public void testGetName(){
        Character c = new Character();
        String expectedName="Player 1";
        String actualName=c.getName();
        assertEquals(expectedName,actualName);
    }

    @Test
    public void testSetName(){
        Character c = new Character();
        String expectedName="New Player 1";
        c.setName(expectedName);

        String actualName=c.getName();
        assertEquals(expectedName,actualName);
    }
     @Test
    public void testGetPosition(){
        Character c = new Character();
        int xCoordinates = 0;
        int yCoordinates = 0;
        c.getPosition();
        assertEquals((int)c.getPosition().getPosition().getX(),0);
        assertEquals((int)c.getPosition().getPosition().getY(),0);
    }

    @Test
    public void testMove() {
        Character c = new Character();
        Position testPos = new Position(arbitraryX,arbitraryY);
        DIRECTION direction=DIRECTION.EAST;
        Position newPos = new Position(1,arbitraryY);
        newPos=c.moveCharacter(direction);
        int currentX = testPos.getPosition().x;
        int currentY = testPos.getPosition().y;
        int newX = newPos.getPosition().x;
        int newY = newPos.getPosition().y;
        //assertEquals(currentX,newX);
        //assertEquals(currentY,newY);

    }

    /*public class testCharacterPosition {
        public static void testGetPosition
    }*/

}
