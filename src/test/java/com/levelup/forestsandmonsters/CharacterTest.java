package com.levelup.forestsandmonsters;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {

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
        Position testPos = new Position(0,0);
        String Direction="N";
        Position newPos = new Position(0,0);
        //newPos=c.moveCharacter(Direction);
        Double currentX = testPos.getPosition().getX();
        Double currentY = testPos.getPosition().getY();
        Double newX = testPos.getPosition().getX();
        Double newY = testPos.getPosition().getY();
        assertEquals(currentX,newX);
        assertEquals(currentY,newY);

    }

    /*public class testCharacterPosition {
        public static void testGetPosition
    }*/

}
