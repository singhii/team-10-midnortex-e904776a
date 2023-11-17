package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {

    static final String DEFAULT_CHARACTER_NAME = "Character";
    Character character;
    Position position;
    
    

    public class GameStatus {
        // TODO: Add other status data
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition = null;
        // TODO: Write a failing unit test that will force you to set this to the right number
        public int moveCount = 0;
    }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    // Pre-implemented to demonstrate ATDD
    // TODO: Update this if it does not match your design
    public void createCharacter(String name) {
        if (name != null && !name.equals("")) {
            status.characterName = name;
            character = new Character(name);
        } else {
            character = new Character();
            status.characterName = character.getName();
        }
    }

    public void startGame() {
        // TODO: Implement startGame - Should probably create tiles and put the character
        // on them?
        // TODO: Should also update the game results?
        Point p = new Point(0,0);
        character.setPosition(p.x, p.y);
        
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results
        //Character character = new Character();
        position =character.moveCharacter(directionToMove);
        //System.out.println("new position = " + position.coordinates.x + "y = " + position.coordinates.y);
        character.setPosition(position.getPosition().x, position.getPosition().y);

        /*System.out.println("In Move, name = " + character.getName());
        System.out.println("Position = " + character.getPosition().getPosition().x);
        System.out.println("Position X= " + character.getPosition().coordinates.x);
        System.out.println("Position Y= " + character.getPosition().coordinates.y);*/
        setCurrentMoveCount(1);
        
    }


    public void setCharacterPosition(Point coordinates) {
        // TODO: IMPLEMENT THIS TO SET CHARACTERS CURRENT POSITION -- exists to be testable
    }

    public void setCurrentMoveCount(int moveCount) {
        // TODO: IMPLEMENT THIS TO SET CURRENT MOVE COUNT -- exists to be testable
        status.moveCount = status.moveCount + moveCount;
    }

    public int getTotalPositions() {
        // TODO: IMPLEMENT THIS TO GET THE TOTAL POSITIONS FROM THE MAP -- exists to be
        // testable
        return -10;
    }

}
