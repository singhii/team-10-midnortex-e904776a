package com.levelup.forestsandmonsters;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {

    /*@BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {

    }

    @Before
    public void setUp(){

    }
    @After
    public void tearDown(){

    }*/

    @Test
    public void testGetName(){
        Character c = new Character();
        String expectedName="Player 1";
        String actualName=c.getName();
        System.out.println("-->"+actualName);
        //assertEquals(expectedName,actualName);
    }

    /*public class testCharacterPosition {
        public static void testGetPosition
    }*/

}
