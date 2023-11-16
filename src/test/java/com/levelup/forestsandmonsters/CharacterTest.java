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

    /*public class testCharacterPosition {
        public static void testGetPosition
    }*/

}