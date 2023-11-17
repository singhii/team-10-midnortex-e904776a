package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class GameControllerTest {
    @Test
    public void initializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }

    @Test
    public void createCharacterTest() {
        GameController testobj = new GameController();
        testobj.createCharacter("Tester");
            assertNotNull(testobj.status);
    }

    

    
    

}